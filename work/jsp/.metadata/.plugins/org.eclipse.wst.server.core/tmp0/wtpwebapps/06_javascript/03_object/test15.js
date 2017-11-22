/*
    ES6 - 객체 추가기능 
    디스트럭처링(Destructuring)
    - 객체(배열포함)에 입력된 값을 개별적인 변수에 할당을 편리하게 처리
*/

"use strict"

var arr1 = [1,2,3];
var a = arr1[0];
var b = arr1[1];
var c = arr1[2];

console.log(a,b,c);


//es6 위치를 기분으로 값을 추출

var arr2 = [10,20,30];
[a, b, c] = arr2;
console.log(a,b,c);

[a, b, c] = [1, 2];
console.log(a,b,c);

[a, b] = arr2;
console.log(a,b);

[a, , c] = [100, 200, 300];
console.log(a,c);

[a, b = 1, c = 2] = [100, 200];
console.log(a,b,c);



var m = {id : "hong", name : "홍길동", email : "hong@a.com"};
// var id = m.id;
// var name = m.name;
// var email = m.email;

console.log(id, name, email);

//ES6 
var {id, name, email, addr = "서울"} = m;
console.log(id, name, email, addr);








