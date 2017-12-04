var fs = require("fs");
var msg = "테스트 입니다";
fs.writeFile("backup1.txt", msg, "utf-8", function(err){
    if(err)
    {
        console.log("비동기 파일 쓰기중 오류 발생");    
        console.log(err);
        return;
    }

    console.log("비동기 파일 쓰기 성공");
});

//동기적 파일 쓰기 : backup2.txt


try
{
    var result = fs.writeFileSync("backup2.txt", msg, "utf-8");
    console.log("동기 파일 쓰기 성공");
} catch (err)
{
    console.log("동기 파일 쓰기중 오류 발생"); 
    console.log(err);   
}

