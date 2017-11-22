//ES6 - 객체 추가 1
//객체의 프로퍼티를 단출해서 사용한다(변수)

let id = "hong", 
    name = "홍길동",
    age = 15;

let m1 = {id : id, name : name, age : age};

console.log(m1);

//프로퍼티 값으로 변수를 사용하는 경우, 프로퍼티의 이름을 생략할수 있다
// 프로퍼티의 이름은 변수명으로 자동설정

let m2 = {id, name, age};
console.log(m2);