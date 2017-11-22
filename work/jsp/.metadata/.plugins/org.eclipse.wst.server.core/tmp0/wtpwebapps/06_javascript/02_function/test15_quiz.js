

var arr = ["일", "이", "삼"];
var cnt = 10;

var id = setInterval(func, 1000);

function func()
{
    console.log(cnt);
    cnt--;
    if(cnt == 0) 
    {
        console.log(arr[Math.floor((Math.random() * arr.length))]);
        clearInterval(id);
    }
}

