/*
    콜밸함수 이해하기 - 3

    - 함수의 결과로 함수 리턴하기
    - 
*/

/*
function func()
{
    function cb()
    {
        console.log("리턴된 함수 실행");
    }

    return cb;
}

var myCb = func();
console.log(typeof(myCb));

myCb();
*/

function func()
{
    return () => { console.log("리턴된 함수 실행"); };
}

/*
var myCb = func();
myCb();
*/

func()();