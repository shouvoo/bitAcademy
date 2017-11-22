/*
    함수에 매개변수의 타입이 기본형인 경우 원본 데이터에 영향이 없다
*/
"use strict"
var i = 100;

function func(i)
{
    i = i + 100;
    console.log("func i : ", i);
}

func(i);
console.log("var i : ", i);
