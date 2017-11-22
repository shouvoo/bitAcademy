//변수의 스코프
"use strict"

var scope = "전역";

function func()
{
    console.log(scope);
    var scope = "지역";
    function inner()
    {
        console.log(scope);
    }
    inner();
}
func();







