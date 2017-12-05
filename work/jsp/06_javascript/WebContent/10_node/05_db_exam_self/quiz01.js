/*
 *  http://localhost:10001/writeForm.do
 *  호출하면
 *  board/writeForm.html 의 내용을 화면에 출력
 *  
 *  등록버튼 클릭 시
 *  사용자 화면에 사용자가 입력한 파라미터 정보를 출력한다.
 *  등록된 내용
	제목 : test
	글쓴이 : 1234
	내용 : aaaaa
 */

/**
 * http 모듈
 * 내장 모듈
 */
var http = require("http");
// url  파싱하기 위해 사용
var url = require("url");
// file 처리 위해서
var fs = require("fs");
// 파라미터 처리 모듈
var qs = require("querystring");

var mysql = require("mysql");

var con = mysql.createConnection({
	user: "hanbit",
	password: "hanbit",
	database: "hanbit"
});



function getDB(sql, arr, callback)
{
	con.query(sql, arr, function(err, result){
		if(err) throw err;
		
		callback(result);
	})
	
	
}

var server = http.createServer(function(request, response) {
	var urlObj = url.parse(request.url, true);  
	console.log(urlObj.pathname)
	if (urlObj.pathname == "/") {
		fs.readFile("board/index.html", function (error, data) {
			response.writeHead(200, 
					{"Content-Type": "text/html; charset=utf-8"});
			response.write(data);
			response.end();
		});
	}
	else if (urlObj.pathname == "/writeForm.do") {
		fs.readFile("board/writeForm.html", function (error, data) {
			response.writeHead(200, 
					{"Content-Type": "text/html; charset=utf-8"});
			response.write(data);
			response.end();
		});
	}
	// write.do 에 대한 처리하는 코드 작성
	else if (urlObj.pathname == "/write.do") {
		//  post 방식일 경우 처리 방법
		var bodyData = "";
		// 데이터를 읽어 들일때 발생 이벤트
		request.on("data", function (data) {
			bodyData += data;
		});
		// end 이벤트 : post 방식일 경우
		//            : 바디의 데이터를 모두 읽었을때 발생
		request.on("end", function () {
			// title=aaa&writer=bbb&content=ccc
			var param = qs.parse(bodyData);

			getDB("insert into tb_board(writer, title , content) values(?, ?, ?)", 
					[param.writer, param.title, param.content], setWrite);
			function setWrite(){}
		});
	}
	else if (urlObj.pathname == "/list.do") {
		fs.readFile("board/list.html", function (error, data) {
			getDB("select * from tb_board order by no desc", [], setList);
			var tag = "";
			response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
			function setList(result)
			{
				for(var i = 0; i < result.length; i++)
				{
					tag += "<tr>\
								<td>"+ result[i].no +"</td>\
								<td><a href=/detail.do?id=" + result[i].no +">"+ result[i].title +"</a></td>\
								<td>"+ result[i].writer +"</td>\
							</tr>";	
												
				}
				data = data.toString().replace(":insertHere", tag);
				response.end(data);
			}
		});
	}
	else if (urlObj.pathname == "/detail.do") {
		/*getDB("select * from tb_board where no=?", [], detailList);

		function detailList()
		{

		}*/

		
		var bodyData = "";
		request.on("data", function (data) {
			bodyData += data;
		});
		request.on("end", function () {
			var param = qs.parse(bodyData);
			console.log(param)
			/*response.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
			
			fs.readFile("", function (err, data) {
				response.write("<h1>" + param.no + "</h1>")
				response.write("<h1>" + param.title + "</h1>")
				response.write("<h1>" + param.writer + "</h1>")
				response.write("<h1>" + param.content + "</h1>")
				response.end(data);
			});*/
		});
	}

	else {
		fs.readFile("board/error404.html", function (error, data) {
			response.writeHead(200, 
					{"Content-Type": "text/html; charset=utf-8"});
			response.write(data);
			response.end();
		});
	}
});

server.listen(10001, function() {
	console.log("10001 번으로 구동중");
});