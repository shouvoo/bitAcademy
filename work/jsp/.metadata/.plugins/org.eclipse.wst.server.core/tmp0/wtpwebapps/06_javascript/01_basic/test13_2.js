/*
    자바스크립트 예외처리 - 2
    try, catch
*/

function isMan(juminNo)
{
    console.log(juminNo.length);
    //넘어온 juminNo 가 13자리가 아니라면 예외를 발생시킨다
    if(juminNo.length != 13)
    {
        throw {result: -1, msg: "주민번호는 13자리 입니다"};
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
    console.log(e.result);
    console.log(e.msg);
} finally
{
    console.log("항상 수행");
}

console.log("나머지 코드 정상적으로 수행됨");