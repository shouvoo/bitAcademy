//서버 자동 재로딩
//supervisor, nodemon, forever
//npm install supervisor -g(전체 다른 프로젝트에서도 사용할수있다 글로벌 옵션)

var http = require("http");
http.createServer(function(req, res){
    console.log("사용자 요쳥 들어옴")
    res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
    res.end("<h1>성공aaaaa</h1>")
}).listen(10001, function(){
    console.log("서버구동 준비중")
})