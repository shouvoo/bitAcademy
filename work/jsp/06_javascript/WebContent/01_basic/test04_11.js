/*
    자바스크립트 변수 - 12
    let - 중복선언이 불가능함
    const - 상수 사용 ECMA6(ES6) 지원됨
    - let 키워드와 변수의 값을 변경할수 없다는 점만 제외하면 동일한 기능 처리됨
    - 선언할때 값을 할당해야 한다
    - {} 이 블록안에서만 사용된다
    - 호이스팅에서 제외된다

*/
var msg = 1;
var msg = 2;

console.log(msg);

let msg2 = 3;
//let msg2 = 4; // 이미 선언된 변수이므로 에러발생
console.log(msg2);

//선언과 동시에 값을 대입해야 한다
//const msg3; // SyntaxError: Missing initializer in const declaration
const msg3 = 5;
//값을 변경할수 없다
//msg3 = 6; // TypeError: Assignment to constant variable.
console.log(msg3);

