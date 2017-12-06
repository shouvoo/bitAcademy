//express 프레임 워크
var express = require("express");
var app = express();

app.get("/", function(req, res){
    res.end("<h1>으아아아아</h1>");
})

app.listen(3000, function(){
    console.log("Express 서버 구동중");
});