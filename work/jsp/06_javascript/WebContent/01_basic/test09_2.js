/*
    ES5 : forEach 반복문

    for ~ in : 반복문
    - 객체의 정보를 출력할때 주로 사용
    - 객체의 키를 반환

    ES6
    for ~ of : 반복문
    - 이터러블 객체를 대상으로 처리한다
    - 값을 반환
*/

"use strict"

var arr = [10, 20, 30, 40, 50];

for(let i = 0; i<arr.length; i++)
{
    console.log(arr[i]);
}
console.log("----------------------------------------------------------------");

/*
객체일 경우에는 for ~ in 반복문능ㄹ 사용할 수 있다
배열도 객체임 for ~ in 반복문을 사용할 수는 있다
배열의 키는 : 인덱스 번호
*/

for (let key in arr) 
{
    console.log(key, arr[key]);
}

console.log("----------------------------------------------------------------");

/*
    배열객체.forEach(function(값, 인덱스, 배열객체){});
    콜백함수 : 다른 함숭에 의해서 호출되거나 이벤트 등에 의해서 호출되는 방식

    반복 중간에 빠져나올수 없다
*/

arr.forEach(function(value, key, arr) {
    console.log(value, key, arr);
}, this);

console.log("----------------------------------------------------------------");

/*
    for ~ of : value 값을 가져오기 위한 편리한 반복문
*/

for(let val of arr)
{
    console.log(val);
}






































