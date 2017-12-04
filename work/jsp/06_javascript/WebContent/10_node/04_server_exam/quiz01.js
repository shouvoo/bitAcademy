const http = require("http");
const port = "10001";
const fs = require("fs");

const server = http.createServer(function(req, res){
    if(req.method == "GET")
    {
        switch(req.url)
        {
            case "/index.do" :
                fs.readFile("board/index.html", "utf-8", function(err, data){
                    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                    res.end(data);
                })
                break;
    
            case "/list.do" :
                    fs.readFile("board/list.html", "utf-8", function(err, data){
                    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                    res.end(data);
                })
            break;
    
            case "/writeForm.do" :
                    fs.readFile("board/writeForm.html", "utf-8", function(err, data){
                    res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                    res.end(data);
                })
                break;

            default :
                fs.readFile("board/error404.html", "utf-8", function(err, data){
                res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                res.end(data);
                })
                break;
            
        }
    } else 
    {
        var pData = "";
        req.on("data", function(data){
            pData += data;
        })

        req.on("end", function(){
            
            var queryString = require("querystring");
            var dd = queryString.parse(pData);
            fs.readFile("board/write.html", "utf-8", function(err, data){
            res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
            res.write(data);
            res.end("title : " + dd.title + "writer : " + dd.writer + "contents : " + dd.contents)
            })
        })
    }
})

server.listen(port, function(){
    console.log("서버 구동중");
})