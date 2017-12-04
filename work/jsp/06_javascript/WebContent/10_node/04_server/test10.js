var http = require("http");
var fs = require("fs");

http.createServer(function(req, res){
    if(req.method == "GET")
    {
        fs.readFile("data/form.html", function(err, data){
            if(err)
            {
                console.log("error");
                return;
            }
            res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            res.end(data);
    
        });
    } else 
    {
        console.log("POST 방식 요청 들어왔음!!")
        /*
            POST 방식일 경우의 파라미터 처리방법
            이벤트 : 
            파라미터를 읽는 동안 발생하는 이벤트 : data
            파라미터를 내용을 다 읽은 다음 호출 이벤트 : end
            req.emit("data", "읽은 파라미터 내용")
            req.emit("data", "읽은 파라미터 내용")
            req.emit("data", "읽은 파라미터 내용")
            .
            .
            .
            .
            req.end("end");
        */

        //파라미터 읽는중
        var pData = "";
        req.on("data", function(data){
            pData += data;
        })

        //모든 바디의 파라미터 읽은 다음 호출
        req.on("end", function(){
            console.log('파라미터 정보')
            console.log(pData);
        })
    }

}).listen(10001, function(){
    console.log("서버구동중")
});