//모듈을 가져오기 위해서 require 사용함
//require 함수 호출시 해당 모듈 파일의 exports 객체를 반환받는다

var cal = require("./test01_module.js");

console.log(cal.add(100, 200));
console.log(cal.sub(100, 200));