/*
    자바스크립트 예외처리 - 1
    try, catch
*/

function isMan(juminNo)
{
    console.log(juminNo.length);
    //넘어온 juminNo 가 13자리가 아니라면 예외를 발생시킨다
    if(juminNo.length != 13)
    {
        throw new Error("주민번호는 13자리 입니다");
    }
    return true;
}

try
{
    var result = isMan("123561234567");
    console.log(result);
}catch(e)
{
    console.log("예외발생");
    console.log(e);
}

console.log("나머지 코드 정상적으로 수행됨");