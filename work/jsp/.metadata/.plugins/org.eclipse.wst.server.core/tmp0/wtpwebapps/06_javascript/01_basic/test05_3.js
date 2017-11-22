/*
    자바스크립트 문자열 - 3

    - 여러줄 입력 처리방식 이해하기
    - ECMA6(ES6) 부터는 템플릿 리터럴 이라는 새로운 유형이 도입
*/

"use strict"

var msg = "저의 " + 
"이름은 " + 
"홍길동 입니다";
console.log(msg);

msg = "저의 \
이름은 \
홍길동 입니다";
console.log(msg);

//ES6 템플릿 방식
msg = `저의 
이름은 
홍길동 입니다`;
console.log(msg);

let name = "홍길동";
let age = 33;
console.log("나의 이름은 " + name + " 이고 나이는 " + age + "세 입니다");
console.log(`나의 이름은 ${name} 이고 나이는 ${age} 세 입니다`);

























