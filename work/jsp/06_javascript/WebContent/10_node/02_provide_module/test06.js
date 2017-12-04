//fs : 파일을 읽거나 쓰거나 할때 사용
//Sync 가 붙은 함수 : 동기적 함수, 붙지 않은 함수 : 비동기 함수

var fs = require("fs");

//비동기적 파일 읽기 함수
fs.readFile("test.txt", "utf-8", function (err, data){
    if(err)
    {
        console.log("읽기 중 에러 발생")
        console.log(err);
        return;
    } 
    
    console.log("비동기 파일 읽기 성공")
    console.log(data)
});

try
{
    var data = fs.readFileSync("test.txt", {encoding : "utf-8"});
    console.log("동기적 파일 읽기 성공")
    console.log(data);
} catch(err) {
    console.log("동기 읽기 중 에러 발생")
    console.log(err);
}