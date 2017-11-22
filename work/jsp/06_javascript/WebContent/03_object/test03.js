/*
    객체 이해하기 - 3

    객체를 변수에 저장하게 되면 변수에는 객체의 주소가 저장됨
*/

"use strict"

var member1 = {id: "hong", email: "hong@a.com"};

var member2 = member1;

member2.id = "kang";
console.log(member1);
console.log(member2);

//객체의 내용을 확인: for ~ in 반복문 활용

for (var key in member1) 
{
    console.log(key, member1[key]);
}

//객체는 배열과 마찬가지로 모든 타입의 값을 저장
var obj = { "str" : "홍길동", "num" : 100, "num2" : 100.7, "bool" : true, 
            "arr" : [10, 20], "obj" : {"email" : "a.com"}, 
            "func" : function(){}, "null" : null, "unde" : undefined};
