/*
    객체 이해하기 - 8

    생성자 이해하기

    프로토타입 : 모든 객체들이 참조하는 객체영역, 객체간의 공통의 영역을 사용한다

*/

function Member(id, name, email)
{
    this.id = id;
    this.name = name;
    this.email = email;
    this.info = function () { console.log(this.id, this.name, this.email)};
}

var m1 = new Member("hong", "홍길동", "hong@a.com");
var m2 = new Member("park", "박길동", "park@a.com");
m1.info();
m2.info();