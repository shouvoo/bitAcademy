/*
    자바스크립트 - 7
    변수와 데이터 타입
    정적타입(static type), 엄격타입(strong type)
    - 변수의 선언시 용도를 고정하는 방식
    - 변수를 만들때 선언한 용도대로만 값을 넣어야 한다
    - 예) c, c++, JAVA

    동적타입(dynamic type)
    - 대입되는 값에 따라서 용도가 변경된다
    - JavaScript

    6개의 데이터 타입
    - 기본데이터 타입
        -string
        -numer
        -boolean
        -null
        -undefined

    - 객체 데이터 타입
        -object
*/

"use strict"

var num1 = 10;
console.log("number : " + num1);

var num2 = 10.3;
console.log("number : " + num2);

var msg = "hi";
console.log("string : " + msg);

var bool = true;
console.log("boolean : " + bool);

var nullVal = null;
console.log("null : " + nullVal);

var undeVal;
console.log("undefined : " + undeVal);

var obj = {};
console.log("object : " + obj);