/*
    함수의 매개변수 처리

    - arguments : 함수의 매개변수를 포함하고있는 내부의 프로퍼티
    - 유사배열 객체
        {"0": 1, "1": 2, "2": 3, "": }
*/


"use strict"


function func()
{
    console.log(arguments.length);
    console.log(arguments);

   /* for (var key in arguments) 
    {
        console.log(key, arguments[key]);
    }*/

    for (var index = 0; index < arguments.length; index++) 
    {
        console.log(arguments[index]);
    }
};


func(1);
func(1, 10, 100);