/*
    자바스크립트 배열 - 3
    - 배열의 요소를 마지막에 추가하기
    - 배열을 변수에 저장할 경우에는 변수에 생성된 주소가 저장된다
*/

"use strict"
var arr = [10, 20, 30];
arr[arr.length] = 40;
arr.push(50);

console.log(arr);

var arr2 = arr;
arr[1] = 2000;
console.log(arr2);