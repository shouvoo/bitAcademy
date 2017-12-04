const http = require("http");
const port = "10001";

//톰캣 서버, 서버 역활 수행
//on("request", cb)
//create("cb")
const server = http.createServer(function(req, res){
    console.log("사용자 요청들어옴")
});
server.listen(port);
console.log("http://localhost:10001 으로 구동중");