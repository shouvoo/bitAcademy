/*
    선언적 함수와 익명 함수 - 2

    익명 함수
    - 함수의 이름이 존재하지 않는것
    - 이름이 없는데 호출방식은? 변수에 함수를 담아서 호출한다
*/

"use strict"

let func1 = function ()
{
    console.log("이름이 없는 함수 - 익명함수");
}

//익명함수 호출
func1();

//일반함수를 변수에 담을 수 있다 test 이름으로 함수 접근이 불가능
//test 이름을 자기 자신안에서 접근이 가능함 : 재귀적 호출 프로그램 작성시
let func2 = function test()
{
    console.log("func2 함수 호출");
    //test(); //이 함수에서만 호출 가능
}

func2();
//test(); // 에러발생


let func3 = function(num1, num2)
{
    console.log(num1 + num2);
}

func3(10, 5);