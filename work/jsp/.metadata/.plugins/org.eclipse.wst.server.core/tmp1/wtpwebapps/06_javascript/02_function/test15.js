/*
    - 특정한 시간뒤에 함수를 실행시킴(콜백함수)

    - var id = setInterval(콜백함수, 밀리세컨드);

    등록된 함수의 정보를 취소하기
    - clearInterval(id);

*/

var id = setInterval(func, 1000, 5);

function func()
{
    console.log("실행");
}

clearInterval(id);