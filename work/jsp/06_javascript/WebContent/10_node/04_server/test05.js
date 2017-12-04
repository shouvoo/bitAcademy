// 내용 응답하기
const http = require("http");
const port = "10001";

//서버생성후 요청 대기
const server = http.createServer(function(req, res){
    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});

    res.write("<h1>화면에 데이터 보내기</h1>");
    res.write("<h1>node server 를 이용한 출력</h1>");
    res.end();
})

//구동
server.listen(port, function(){
    console.log("서버 구동 성공")
});