/*
    자바스크립트 변수 - 6
    변수의 호이스팅(hoisting)
    - 자바스크립트 엔진이 스크립트를 해석하는 단계
    - 컴파일과 실행
    - 컴파일시에 변수에 대한 정보를 먼저 설정한다
*/

"use strict"
var id = "hong";
console.log(id);

var id = "kim";
console.log(id);

var name;
console.log(name);

/*
    컴파일 단계
    - var id; 10라인, 13라인
    - var name; 16라인

    실행 단계
    id = "hong";
    console.log(id);
    id = "kim";
    console.log(id);
    console.log(name);
*/