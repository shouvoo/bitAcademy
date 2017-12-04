//전역객체와 console

//현재 작업 디렉토리
console.log("__dirname", __dirname)

//현재 작업 파일
console.log("__filename", __filename)

var msg = "Hello , NodeJS";
console.log("%s!!!", msg);

var person = {
    "name" : "홍길동",
    "age" : 22, 
    "addr" : "서울특별시"
}

console.log("%s!!!", msg); // 문자열
console.log("%j", person); // JSON 객체
console.log("나이 : %d", person.age); // 숫자


/*
    시간 측정
    console.time(구분이름) - 시작
    console.timeEnd(구분이름) - 종료
*/

console.time("forloop");
var sum = 0;
for(var i = 0; i < 1000000; i++)
{
    sum += i;
}
console.timeEnd("forloop")
