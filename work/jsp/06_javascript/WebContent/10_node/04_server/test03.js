const http = require("http");
const port = "10001";

const server = http.createServer(function (req, res){  
    //console.log("res ::: ", res)
    console.log("사용자 접속")
    //클라이언트로 응답하기
    res.end("<h1>hee success</h1>");
});

server.listen(port, function(){
    console.log(`http://localhost:${port} 번에서 구동중`)
});
