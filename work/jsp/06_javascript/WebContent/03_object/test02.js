/*
    객체 생성 시 값의 초기화 및 프로퍼티 삭제
*/

//객체 생성 및 값의 초기화

var member = {"id" : "hong", "email" : "hong@a.com"};

//동적으로 프로퍼티 추가
member.name = "홍길동";

console.log(member);

//프러퍼티 삭제 : delete 객체.프러퍼티명

delete member.email;

console.log(member);

//객체 삭제 : 실행되지 않는다
//delete member;
console.log(member);

//객체의 프로퍼티 이름은 "" 을 생략해도 된다
//단, JSON 객체는 생략할 수 없다
var member2 =  {id : "kim", email : "kim@a.com"};
console.log(member2);














