/*
    콜백함수 이해하기 - 2

    - 매개변수를 함수 넘기기
    - 매개변수로 익명함수 넘기기
*/

function func(callback)
{
    console.log(typeof(callback));
    callback();
}

func(function (){ console.log("익명함수 호출됨"); });
func(() => { console.log("익명함수 호출됨"); });



/*
function myCall()
{
    console.log("myCall 호출됨");
}

func(myCall);
*/