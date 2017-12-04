"use strict"

function func()
{
    var i = 100;
    if(i % 2 == 0)
    {
        var msg = "짝수";
    }

    for(var k = 1; k < 5; k++)
    {
        console.log('${i}는 ${msg}');
    }
}

