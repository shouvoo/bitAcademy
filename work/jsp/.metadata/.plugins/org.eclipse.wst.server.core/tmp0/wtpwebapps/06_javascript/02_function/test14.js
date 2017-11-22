/*
    - 특정한 시간뒤에 함수를 실행시킴(콜백함수)

    - var id = setTimeout(콜백함수, 밀리세컨드);

    등록된 함수의 정보를 취소하기
    - clearTimerOut(id);

*/

function func()
{
    var date = new Date();
    var time = date.toLocaleTimeString();
    console.log(time);
    var id = setTimeout(func, 1000);
    
    
    clearTimeout(id);
}

func();

