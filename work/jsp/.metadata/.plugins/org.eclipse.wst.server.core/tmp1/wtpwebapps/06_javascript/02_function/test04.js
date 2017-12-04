/*
    함수의 호이스팅과 오버로딩

    - 함수의 오버로딩을 지원하지 않는다
    - 동일한 이름의 함수가 있을 경우 덮어쓰기 된다!!
    - 함수 호출시 매개변수의 개수는 호출에 영향을 주지 않는다
*/

"use strict"

var func = function(){  console.log(0); };
func();

function func() {  console.log(1); };
func();

function func() {  console.log(2); };
func();

function func(num1, num2, num3) {  console.log(3); };
func(1,2,3);