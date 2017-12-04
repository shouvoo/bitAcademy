//http://localhost:10001/text.do?id=aaa&pass=1111
/*
    실행 시 사용자 브라우저 응답결과가 아래와 같이 출력되도록

    요청 URI : /test.do
    파라미터
    id : aa
    pass : 1111
*/


const http = require("http");
const port = "10001";
var url = require("url");

const server = http.createServer(function(req, res){
    
    var urlObj = url.parse(req.url, true); 


    console.log("id : ", urlObj.query.id)
    console.log("pass : ", urlObj.query.pass)
    console.log(urlObj.pathname)
    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    res.write("<h1>uri : " + urlObj.pathname + "</h1>");
    res.write("<h1>파라미터</h1>");
    for(var key in urlObj.query)
    {
        res.write(`<h1>${key} : ${urlObj.query[key]}</h1>`);
    }
})

server.listen(port, function(){
    console.log("서버 구동중");
})