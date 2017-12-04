/*  
    함수의 동기적 호출과 비동기적 호출

    동기적 호출
    - 호출한 함수의 실행이 종료될 때까지 block 상태에 빠진다(일반적 형태)
    - 함수에서 시간이 오래 걸리면 다음 실행이 오랫동안 지연될 수 있다

    비동기적 호출
    - 함수 실행을 시킨 후 함수가 작업을 띁날때까지 기다리지 않고 즉시 다음 명령문을 실행한다
    - 비동기적 대표적 케이스 : 자바스크립트 ajax 통신
*/

// prompt 모듈 다운도르 설치 : npm install prompt
var prompt1 = require("prompt-sync")();

var prompt2 = require("prompt");

var name = prompt1("당신의 이름은 무엇입니까?");
console.log(name);

prompt2.start();
prompt2.get(['age', 'addr'], function (err, result) {
    console.log(`당신의 나이는 ${result.age} 이고 주소는 ${result.addr}입니다`);
});

console.log("사용자 정보 입력 종료");