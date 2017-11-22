/*
    자바스크립트 배열 - 3
    배열의 요소 삭제
*/
"use strict"

var arr = [10, 20, 30, 40, 50];
//splice (삭제할 인덱스, 삭제할 크기)
arr.splice(1, 1);
console.log(arr);
console.log(arr.length);

arr.splice(0, 2);
console.log(arr);
console.log(arr.length);