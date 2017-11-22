/*
    Node 를 이용한 외부모듈 사용하기
    써드파티 모듈 : 개발사에서 만드는 것이 아닌 일반 개발자들이 만들어서 배포하는것

    propmt-sync : 사용자 화면에서 데이터를 입력받게 처리됨(Scanner 비슷)

    외부모듈을 가져오기
    - 사용하려는 모듈을 npm(패키지 관리도구)을 통해서 가져온다(다운받는다)
    - npm install 모듈명
    - 외부모듈을 참고하려고 할때 npmjs.com 에서 확인

    npm install prompt-sync : prompt-sync 설치 방법

    -실행시에는 require() 함수 이용
*/

var prompt = require('prompt-sync')();
// 
// get input from the user. 
// 
var n = prompt('How many more times? ');
console.log("n : ", n);

