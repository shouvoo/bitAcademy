/*
    콜백함수 이해하기 - 1

    - 함수도 데이터 타입의 일종이기 때문에 값처럼 주고 받을 수 있다
*/
"use strict"

function func()
{
    console.log("func 호출됨");
};

var f1 = func;
var f2 = f1;


func();
f1();
f2();