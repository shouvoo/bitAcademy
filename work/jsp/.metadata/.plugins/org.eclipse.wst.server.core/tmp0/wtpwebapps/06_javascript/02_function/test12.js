// 매개변수에 객체형을 넘기는 경우 원본 데이터에 영향이 발생한다
"use strict"

var arr = [10, 20, 30, 40];

function func(arr)
{
    arr.push(100);
    console.log("func arr : ", arr);
}

func(arr);
console.log("var arr : ", arr);
