var express = require("express");
var app = express();

//웹서버에서 사용할 정적 파일들의 루트 디렉토리 위치 지정
app.use(express.static("public"));
app.get("/", function(req, res){
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.write("<h1>정적 파일 테스트</h1>");
    res.write("<img src='/images/pic1.jpg' width='400' height='300'>");
    res.end();
})

app.listen(3000, function(){
    console.log("dddddd")
})