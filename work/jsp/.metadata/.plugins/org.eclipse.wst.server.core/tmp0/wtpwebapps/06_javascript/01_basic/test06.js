/*
    자바스크립트에서 false 나타내는 값

    5가지 
    null, undefined, 0, '', NaN
*/

"use strict"
console.log("!!0", !!0);
console.log("!!null", !!null);
console.log("!!undefined", !!undefined);
console.log("!!NaN", !!NaN);
console.log("!!''", !!'');

var id;
if(id)
{
    console.log("id 값이 존재한다");
} else 
{
    console.log("id 값이 없다");
}

//0이외의 숫자는 모두 true
//boolean 형으로 값을 변환할때 사용
console.log("0", Boolean(0));
console.log("100", Boolean(100));

//빈문자열을 제외한 모든 문자열은 true
console.log("", Boolean("")); // false
console.log("test", Boolean("test")); // true
console.log(" ", Boolean(" ")); // true

















