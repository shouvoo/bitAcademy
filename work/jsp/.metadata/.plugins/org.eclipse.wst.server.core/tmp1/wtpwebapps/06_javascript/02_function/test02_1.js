/*
    선언적 함수와 익명 함수 - 1

    선언적 함수
    - 함수의 이름이 존재하는 것
    - 컴파일 시점에 함수 정보를 등록
    - 함수를 선언하기 이전에 사용이 가능하다
    - 함수가 별도의 return 문을 사용하지 않은 경우 디폴트로 undefined 가 반환
*/

"use strict"


function func1(num1, num2)
{
    console.log(num1, num2);
    return num1 + num2;
}

var result = func1(1, 2);
console.log("func1  :   ", result);

//func2가 선언되기 이전에 호출
result = func2();
console.log("func2  :   ", result);

function func2()
{
    return "선언전에 호출가능?";
}


function func3(){}

//결과를 반환하지 않은 경우 undefined 가 반환됨
console.log(func3());

