/*
    논리연산자의 활용
    - 조건문을 대신해서 처리(간단한 명령일 경우)
*/

"use strict"

var num = 10;
if((num % 2) == 0)
{
    console.log("num 은 짝수입니다");
};

((num % 2) == 0) && console.log("num 은 짝수입니다");