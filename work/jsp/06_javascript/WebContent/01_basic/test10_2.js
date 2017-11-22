/*
    자바스크립트 배열 - 2
*/

"use strict"

//초기값을 가지는 배열 생성
let arr = [10, 20, 30];

/*
    배열은 객체이기 때문에 아래와 같은 특성이 발생한다
    - 배열의 인덱스에 문자열을 넣을수 있다
    - 문자열을 키로 사용하는 경우 크기에 포함되지 않는다
    - 일반적인 방식에서는 권장하지 않는다
*/

arr["id"] = "hong";
console.log("arr.length : " + arr.length);
console.log("arr : ", arr);

arr["9"] = "10번쩨 데이터";
console.log("arr.length" + arr.length);



