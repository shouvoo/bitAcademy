/*
    즉시 실행 함수

    - 함수 정의함과 동시에 바로 실행
    - 최초 한번만 실행하는 코드를 처리 적합함
    - 대다수의 라이브러리가 사용한다

    (형식)
    (함수정의)([매개변수값, ...]);
*/
"use strict";

//(() => { console.log("즉시 실행 함수 호출됨") })();
((msg) => { console.log("즉시 실행 함수 호출됨", msg) })("테스트");
