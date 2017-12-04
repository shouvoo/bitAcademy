// url 모듈 : url 정보를 분석
var url = require("url");
var urlObj = url.parse("http://localhost:10001/list.do?id=aaa&pass=1234", true); 
// true 일 경우 urlObj.query 객체로 파싱처리
//false 일 경우 urlObj.query 문자열로 파싱처리


console.log(urlObj.query);
console.log(urlObj.query.id);