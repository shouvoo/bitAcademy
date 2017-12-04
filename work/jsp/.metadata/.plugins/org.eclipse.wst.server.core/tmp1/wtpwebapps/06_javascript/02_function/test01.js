/*
    함수 : 명령어들을 묶어 놓은 것

    function 함수명([매개변수, ...])
    {
        실행명령어
        [return 반환값]
    }
*/

"use strict"

//함수의 4가지 형태
// 1. 파라미터와 반환값이 모두 없는 경우
function func1()
{
    console.log("1번");
}

func1();

// 2. 파라미터는 없고 반환값이 존재하는경우
function func2()
{
    console.log("2번");
    return "반환값 - 2";
}

func2();

// 2. 파라미터는 있고 반환값이 없는경우
function func3(val)
{
    console.log(val);
}

func3("func3");

// 4. 파라미터가 있고 반환값이 존재하는경우
function func4(val)
{
    console.log(val);
    return "반환값 - 4";
}

func4("func4");

/*
    자바와의 차아점
    자바스크립트의 함수는 매개변수에는 변수의 타입에 대한 var, let, const를 
    선언하지 않는다
    반환타입 자테를 표시하지 않는다
*/