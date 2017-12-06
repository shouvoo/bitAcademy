var express = require("express");
var router = express.Router();
var path = process.cwd();

var db = require(path+"/util/db_info");


var mysql = require("mysql");

var con = mysql.createConnection({
    
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
});

module.exports = router;





router.get("/list.do", function(req, res){

    var sql = "select no, title, writer " +
	"  from tb_board         " +
	" order by no desc        ";
	con.query(sql, function (err, rows, fields) {
		// 에러가 존재할 경우
		if (err) {
			throw err;
		}
        res.render(path + "/view/board/list.pug", {obj : rows});
	});
})

router.get("/write.do", function(req, res){
    var pData = "";
	req.on("data", function (data) {
		pData += data;
	});
	
	req.on("end", function () {
        var sql = "insert into tb_board(writer, title, content) values(?, ?, ?) ";
		con.query(sql, [req.body.writer, req.body.title, req.body.content], function (err, result) {
					if (err) {
						throw err;
                    }
                    res.render(302, {"Location": "/list.do"});
				}
		);
	});
})

router.get("/writeForm.do", function(req, res){
    res.render(path + "/view/board/writeForm.pug")

})