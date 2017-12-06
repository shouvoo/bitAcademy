var express = require("express");
var app = express();

app.get("/", function(req, res){
    console.log("메인 호출 페이지")
})


app.get("/board/list.do", function(req, res){
    console.log("리스트 호출 페이지")
})

app.get("/board/write.do", function(req, res){
    console.log("글쓰기 호출 페이지")
})

app.listen(3000, function(){
    console.log("서버 구동중")
})