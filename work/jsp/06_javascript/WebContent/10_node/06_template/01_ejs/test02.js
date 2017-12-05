var ejs = require("ejs");
var http = require("http");
var fs = require("fs");

http.createServer(function(req, res){
   /* fs.readFile("test02.ejs", "utf-8", function(err,data){
        var result = ejs.render(data, {title : "노드게시판", data : [2,4,6,8,]});
        console.log(result);
        res.writeHead(200, {"Content-Type": "text/html; charset=utf8"});
        res.end(result);
    })*/

    ejs.renderFile("./test02.ejs", {title : "노드게시판", data : [2,4,6,8,]}, function(err, data){
        res.writeHead(200, {"Content-Type": "text/html; charset=utf8"});
        res.end(data);
    })
    
}).listen(10001);