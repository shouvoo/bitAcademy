/*
    객체이해하기 - 4

    - 일반적으로 함수내에서 this 는 함수를 호출한 객체이다
*/

"use strict"

var m1 = {name: "홍길동"};
var m2 = {name: "배수지"};

function msg()
{
    console.log(this);
    console.log(this.name + "님이 입장합");
}


// msg(); 문제가 발생

m1.msg = msg;
m2.msg = msg;

m1.msg();
m2.msg();