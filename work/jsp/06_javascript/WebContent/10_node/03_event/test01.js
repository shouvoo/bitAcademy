/*
    이벤트를 연결 할수있는 모든 객체는 EventEmitter 객체를 상속 받는다

    사용자가 직접 이벤트를 직접 정의하고 싶다면 EventEmitter 객체를 이용해야 한다

    이벤트를 설정할때 : on
    설정된 이벤트를 사용 : emit
*/

var EventEmitter = require("events").EventEmitter;

//상속을 쉽게 처리하기 위해서 util 모듈 사용
var util = require("util");

//이벤트를 설정하려는 사용자 정의 객체 정의
var Member = function(){};

//Member 가 EventEmitter 를 상속
util.inherits(Member, EventEmitter);

Member.prototype.join = function(){
    //join 으로 등록된 이벤트 발생
    this.emit("join", "tester", "테스터");
};

Member.prototype.info = function(){
    console.log("info 함수 호출")
    this.emit("info");
}

var m = new Member();
//이벤트 설정하기
m.on("join", function(id, name){
    console.log("join 이벤트 발생");
    console.log("id", id);
    console.log("name", name);
});

m.on("info", function(){
    console.log("info 이벤트 발생");
});

m.join();
m.info();