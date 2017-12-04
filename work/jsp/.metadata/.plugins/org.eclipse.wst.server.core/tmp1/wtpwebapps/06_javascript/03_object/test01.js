/*
    객체 이해하기 - 1

    - 객체는 문자열로 이름을 붙인 값들의 집합체
*/

//빈 객체 생성
var member = {};

// 객체에 저장하는 값을 프로퍼티(property) 라고 한다
// 문자열을 사용해서 값을 저장한다
// 객체.프로퍼티명 = 값
// 객체["프로퍼티"] = 값

member.id = "hong";
member["email", "aa"] = "hong@a.com";

// 객체의 프로퍼티 확인하기
console.log(member);
console.log(member.id);
console.log(member["id"]);

console.log(member.email);
console.log(member["email"]);

//객체의 프로퍼티명에 특수문자 또는 공백 있을 경우 "." 으로 설정할 수 없다
//member.home-page = "ho0g.com"; // 사용할수 없음
member["home-page"] = "hong.com"

console.log("home-page" , member["home-page"]);






















