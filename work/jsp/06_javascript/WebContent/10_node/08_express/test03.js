var express = require("express");
var app = express();

//미들웨어 사용하기
//세션 처리하는 기능 호출
app.use(function(req, res, next){
    console.log("1번 use 함수 호출");
    req.msg = "a";
    next();
})

//파일 처리하는 기능 호출
app.use(function(req, res, next){
    console.log("2번 use 함수 호출");
    req.msg += "b";
    next();
})


app.use(function(req, res, next){
    console.log("3번 use 함수 호출");
    req.msg += "c";
    next();
})

app.get("/", function(req, res){
    res.end("<h1>"  + req.msg +  "</h1>")
})

app.use(function(req, res, next){
    res.writeHead(404, {"Content-Type" : "text/html; charset=utf-8"});
    res.end("<h1>404 요청한 페이지 존재하지 않습니다</h1>")
})

app.listen(3000, function(){
    console.log("서버 구동중")
})