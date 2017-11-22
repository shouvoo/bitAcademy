/*
    관리하려는 회원의 
    유비  22  남   현덕
    장비  44  남   장수
    관우  11  남   관소

    - 함수를 이용한 객체 생성
*/

function makeMember(name, age, gender, addr)
{
    return {name: name, age: age, gender: gender, addr: addr};
}

var m1 = makeMember("조조", 33, "남", "성남");
var m2 = makeMember("유비", 22, "남", "현덕");
var m3 = makeMember("장비", 44, "남", "장수");
var m4 = makeMember("관우", 11, "남", "관수");

console.log("m1", m1);
console.log("m2", m2);
console.log("m3", m3);
console.log("m4", m4);

//var m1 = {name: "조조", age: 33, gender: "남", addr: "성남"};