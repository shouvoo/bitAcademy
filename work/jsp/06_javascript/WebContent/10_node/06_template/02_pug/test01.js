/*
    https://pugjs.org/ 참조
    pug  주의 사항
    띄어쓰기: 탭과 스페이스 동시에 사용 불가능
    작성규치
    1. 태그를 작성
       태그이름 
       h1
       p
    2. 태그안에 내용 입력하기
       태그 내용
       여러줄의 내용 입력하기 태그명 뒤에 "." 을 사용
       p.
    3. 태그에 속성 입력하기
       태그명 뒤에 괄호를 사용해서 입력(속성명="값")
       a(href="http~~")
    
    5. 주석문
       // 주석내용 입력
*/

const http = require("http");
const pug = require("pug");
const fs = require("fs");

http.createServer(function(req, res){
    fs.readFile("test01.pug", "utf-8", function(err,data){
        var html = pug.render(data);
        res.writeHead(200, {"Content-Type":"text/html; charset=utf-8"});
        res.end(html);
    })
   
}).listen(10001, function(){
    console.log("서버구동")
})

