/*
    ES6 - 파라미터 디폴트 설정하기

    - 파라미터에 디폴트 값을 설정해서 간편하게 파라미터 값이 안온 경우 초기화를 시킨다
*/


function func(num1=0, num2=0)
{
    // num1 = num1 || 0;
    // num2 = num2 || 0;


    return num1 + num2;
}

console.log(func()); // 0
console.log(func(100)); // 100
console.log(func(100, 200)); //300