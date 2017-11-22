/*
    undefined, null, NaN

    
*/
//undefined 의 경우 변수는 존재하지만 값을 저장하지 않아서 타입을 모를 경우
//undefined 는 직접 값을 비교할수 있다
var msg1;
if(msg1 == undefined) console.log("변수명이 존재하지만 값이 없다")

var msg2 = 20;
msg2 = undefined; // 존재하는 변수를 undefined로 만들수있다

//특정 개체를 가리키지 않음을 지정할때 null 사용
//직접 값의 비교가 가능하다
var msg3 = null;
if(msg3 == null) console.log("msg3은 null 상태임")

//NaN : 숫자가 아닌 상태(Not a Number)
var msg4 = NaN;
console.log("msg4의 타입", typeof(msg4));

//값의 직접 비교가 불가능 하다
if(msg4 = NaN) console.log("msg4 == NaN");
//값의 비교를 위해서 isNaN 이란 함수를 활용해야 한다
if(isNaN(msg4)) console.log("isNaN");




