// test08.js의 내용을 변경한다.
// /html 으로 요청이 오면 data/test.html을 전송
// /image 으로 요청이 오면 data/test.jpg을 전송
// /audio 으로 요청이 오면 data/test.mp3을 전송
const http = require("http");
const fs = require("fs");
http.createServer(function(req, res) {
	var fName = "";
	var contentType = "";
	switch (req.url) {
	case "/html":
		fName = "test.html";
		contentType = "text/html; charset=UTF-8";
		break;
	case "/image":
		fName = "test.jpg";
		contentType = "image/jpeg";
		break;
	case "/audio":
		fName = "test.mp3";
		contentType = "audio/mp3";
		break;
	}
	fs.readFile("data/" + fName, function (err, data) {
		res.writeHead(200, {"Content-Type": contentType});
		res.end(data);
	});
	
}).listen(10001, function() {console.log("10001 구동");});