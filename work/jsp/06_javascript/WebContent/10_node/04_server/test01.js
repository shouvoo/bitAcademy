/*
    HTTP 모듈을 이용한 서버 통신 이해하기
*/

var http = require("http");
var port = "10001";

//톰캣 서버, 서버 역활 수행
var server = http.createServer();

//사용자  접속시에 실행
server.on("request", function(){
    console.log("사용자 요청옴")
});

server.listen(port);
console.log("서버 구동중")