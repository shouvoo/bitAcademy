var ejs = require("ejs");
var http = require("http");
var fs = require("fs");

http.createServer(function(req, res){
    fs.readFile("test01.ejs", "utf-8", function(err,data){
        var result = ejs.render(data);
        console.log(result);
        res.writeHead(200, {"Content-Type": "text/html; charset=utf8"});
        res.end(result);
    })
    
}).listen(10001);