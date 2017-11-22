/*
    자바스크립트 형변환
*/

"use strict"

//boolean 형을 number 형으로 변환시 true(1), false(0)로 변환된다
console.log(true, Number(true)); // 1
console.log(false, Number(false)); // 0

//수치형이 필요한 경우 자동 변환(묵시적 형변환, 암묵적 형변환)
console.log(true +  1); // 2
console.log(false +  1);  // 1
console.log(false +  true);  // 1

//string 형을 number 형으로 명시적 변환
//빈 문자열 또는 공백만 있는 문자열은 0이고
//숫자가 아닌 문자열이 포함된 경우 NaN 으로 변환된다
console.log("", Number(""));  // 0
console.log("   ", Number("  "));  // 0
console.log("12", Number("12"));  // 12
console.log("120원", Number("120원"));  // NaN(Not a Number)
console.log("$120", Number("$120"));  // NaN

console.log("12", parseInt("12"));  // 12
//parseInt 사용시 숫자로 시작되는 부분은 모두 변경됨
console.log("120원", parseInt("120원"));  //120
console.log("$120", parseInt("$120"));  // NaN

//boolean 형을 문자열로 변환하기
console.log(true, String(true)); // "true"
console.log(false, String(false)); //"false"
console.log(false, false + ""); //"false"

//숫자열을 문자열로 변환하기
console.log(22, String(22));
console.log(22, 22 + "");
















