/*
    객체 이해하기 - 5

    - 객체는 
    - 연관성있는 데이터를 묶어서 관리하고 싶을때
    - 각각의 값을 코드에서 쉽게 구분하고 싶을때
    - 데이터와 기능을 묶어서 관리
*/


"use strict"

var member = {id : "hong", name : "홍길동", setId : (id) => {this.id = id;}, getId : () => {return this.id;}};

member.setId("kim");
console.log(member.getId());

//여러명의 교육생 정보를 관리해야 한다면
