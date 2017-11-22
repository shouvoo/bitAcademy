/*
    ES6 에서 추가된 화살표 함수 - 2
    
    - 실행문장 중심으로 살펴보기
*/
"use strict"

var func1 = function(num)
{
    return num * num;
}

console.log(func1(1));

func1 = (num) =>{return num * num;};

console.log(func1(2));

func1 = (num) => num * num; // {} 없이 사용할 경우에는 return 문을 생략한다

console.log(func1(3));

func1 = (num) => console.log("테스트");

console.log(func1(4)); //넘겨주는 값이 없을 경우 undefined 값이 반환된다

func1 = (num) => {console.log("테스트");  return num * num;};
console.log(func1(5));