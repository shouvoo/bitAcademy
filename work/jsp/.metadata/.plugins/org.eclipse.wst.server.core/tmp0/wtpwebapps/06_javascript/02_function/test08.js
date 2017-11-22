/*
    내부함수

    - 함수안에 선언된 함수
    - 내부함수의 호출은 자신이 선언된 외부함수 내에서만 접근이 가능함
*/

"use strict"

//외부함수
function outerFn()
{
    console.log("outerFn");

    //내부함수
    function innerFn()
    {
        console.log("innerFn");
    }
    innerFn();
}

outerFn();
//innerFn(); //호출이 불가능 - 에러