/*
    eval("자바스크립트 코드 문자열")

    - 문자열로 되어있는 자바스크립트 코드를 실행하게 한다
    - Ajax(비동기 통신의 데이터 처리), JSON.parse() : 대체

    -엄격모드(use strict) 사용시 eval을 사용한 변수 접근이 되지 않는다
*/

//"use strict"

var data = "var i = 100; var j = 200; console.log(i + j);";
eval(data);
console.log(i);
console.log(j);

