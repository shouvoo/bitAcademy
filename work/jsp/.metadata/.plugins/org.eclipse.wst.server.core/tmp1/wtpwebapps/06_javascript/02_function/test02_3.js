/*
    선언적 함수와 익명 함수 - 3

    - 익명 함수는 함수의 호이스팅 대상에서 제외된다
      컴파일시에 함수 정보가 등록되지 않는다
    - 결론적으로 선언 이후에만 호출이 가능하다
*/

"use strict"


var func = function()
{
    console.log("func1 호출됨!!");
}

func();