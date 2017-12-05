/*
    https://pugjs.org/ 참조

    5.  속성을 여러개를 설정해야 한다면"," 로 구분한다

    6.  아이디 또는 클래스 속성이 정의된 div 태그를 생성할 때는 div 태그는 생략이 가능하다
        id가 적용된  div태그 : #content
        class 가 적용된 div 태그 : .f20

    7.  script태그를 적용
        script(src="")

    8.  스타일 적용
        link(href="")

    9.  pug 안에서 스크립트 사용
        - code


*/

const http = require("http");
const pug = require("pug");
const fs = require("fs");

http.createServer(function(req, res){
    fs.readFile("test02.pug", "utf-8", function(err,data){
        var html = pug.render(data);
        res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
        res.end(html);
    })
   
}).listen(10001, function(){
    console.log("서버구동")
})

