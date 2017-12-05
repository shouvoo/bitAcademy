/*
    https://pugjs.org/ 참조

    9.  pug 안에서 스크립트 사용
        - code

    10  동적인 값 사용하기
        #{이름}
*/

const http = require("http");
const pug = require("pug");
const fs = require("fs");

http.createServer(function(req, res){
    fs.readFile("test03.pug", "utf-8", function(err,data){
        var html = pug.render(data, {title : "PUG 사용하기", arr : [2,4,6,8], url: "https://pugjs.org"});
        res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
        res.end(html);
    })
   
}).listen(10001, function(){
    console.log("서버구동")
})

