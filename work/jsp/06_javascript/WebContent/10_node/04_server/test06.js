const http = require("http");
const port = "10001";

const server = http.createServer(function(req, res){
    console.log(req.url);
    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
    res.write(
        "<html>\
            <head><title>Node Web서버</title>\</head>\
            <body>\
                <h1>Node를 이용한 Web서버</h1>\
            </body>\
        </html>"

    );

    res.end();
});

server.listen(port, function(){
    console.log("서버 구동중")
})