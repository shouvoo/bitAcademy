/*
    자바스크립트 변수 - 10
    변수의 범위
    - var 로 선언된 변수는 글로벌 변수이다
    - 선언된 블록에 제한 받지 않는다
*/

"use strict"
var mag = 1;

if(msg == 1)
{
    var msg = 2;
    console.log(msg);
}

console.log(msg);
{
    var msg2 = 3;
}
console.log(msg2);

for(var i=1; i<10; i++)
{
    console.log("in : " + i);
}

console.log("out : " + i);