/*
    ES6에서 추가된 화살표 함수(arrow function) - 1

    - 함수를 더욱더 심플하게 정의할수 있도록 해준다
    - 형태
    (매개변수) => {명령어;...}
*/

var func1 = function()
{
    console.log("익명 func1");
}

func1();

//매개변수가 없는 경우 arrwo function
func1 = () => { console.log("화살표 func1") };

func1();

var func2 = function(num)
{
    console.log("익명 func2", num);
}

func2(1);

//매개변수가 하나인 경우 () 를 뺄수있다
func2 = num => { console.log("익명 func2", num); };

func2(2);

func2 = (num) => { console.log("익명 func2", num); };

func2(3);

var func3 = function (num1, num2)
{
    console.log("익명 func3", num1, num2);
}

func3(10, 20);

var func3 = (num1, num2) => { console.log("익명 func3", num1, num2);};

func3(30, 40);















