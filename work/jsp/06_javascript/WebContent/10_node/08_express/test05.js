var express = require("express");
var fs = require("fs");
//POST 요청 데이터를 파싱
var bodyParser = require("body-parser");
var app = express();
app.use(bodyParser.json()); //application/json

//application/x-www-form-urlencoded
//request.body 생성
app.use(bodyParser.urlencoded({extended:true}));

app.get("/", function(req, res){
    res.sendFile(__dirname + "/views/form.html");
    // fs.readFile("views/form.html", function(err, data){
    //     res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    //     res.write(data);
    //     res.end();
    // })
})

app.post("/form.do", function(req, res){
    res.writeHead(200, {"Content-Type" : "text/html; charset=utf-8"});
    res.write("<h1>" + req.body.jumin1 + "</h1>");
    res.write("<h1>" + req.body.jumin2 + "</h1>");
    res.end();
})

app.listen(3000, function(){
    console.log("실행중")
})

