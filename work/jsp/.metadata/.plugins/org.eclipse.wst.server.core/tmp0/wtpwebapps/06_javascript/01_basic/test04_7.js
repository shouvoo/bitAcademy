/*
    자바스크립트 변수 - 8
    변수의 자료형 검사

    -typeof 데이터 : 데이터 타입을 문자열로 반환
    -typeof(데이터)
    -null 데이터의 타입은 object 로 표시됨 : 오래된 버그!!!!
    -function 은 일급 객체하고 하는데 데이터 타입을 출력하면 function 으로 출력
*/

console.log(typeof("test"));
console.log(typeof(10));
console.log(typeof(true));
console.log(typeof(null)); // object (주의 null 아님)
var a;
console.log(typeof(a));
console.log(typeof({}));

//객체 중에서 특별한 기능을 가진 일급객체 : function

console.log(typeof(function(){})); // function (주의 : object 출력안됨)
