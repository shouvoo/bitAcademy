/*
    객체이해하기 - 7

    자바스크립트의 생성자란?

    - 일반 함수 동일
    - 대문자로 이름을 시작하게 만든다
    - 생성자의 역활을 하기 위해서 new 와 함께 사용해야 함
    - new 와 함께 사용하지 않으면 this가 생성되지 않는다
*/

"use strict"

//생성자 역활의 함수 정의
var m1 = Member();
var m2 = new Member(); //this 의 의미가 생긴다 생성된 객체 자신을 나타낸다

console.log(m1); // 일반함수로 호출되어서 반환값이 없어 undefined
console.log(m2); // new 와 함께 사용한 경우 생성된 객체가반환된다

function Member()
{
    console.log(this);
}








