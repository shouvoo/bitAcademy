var http = require("http");
var path = "";
var server;
var url = require("url");
var fs = require("fs");

module.exports = function()
{
    return {
        use(cb){
            server = http.createServer(function(req, res){
                cb(req, res);
            })
        },
        get(path, cb){
            server = http.createServer(function(req, res){
                

                var pathname = url.parse(req.url).pathname;
                console.log(pathname, path)
                if(pathname != path){
                    fs.readFile("./html/error404.html", "utf-8", function(err, data) {
                        // 오류에 대한 처리 코드 추가 가능
                        res.writeHead(200, {"Content-Type": "text/html; charset=utf-8"});
                        res.end(data);	
                    });	
                    return;
                }
                cb(req, res);

            })
        },
        listen(port, cb){
            server.listen(port, cb);
        }
    }
}