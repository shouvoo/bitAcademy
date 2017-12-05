var mysql = require("mysql");
var con = mysql.createConnection({
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
})

con.connect();

var sql = "update tb_board set title=? where no=? ";

con.query(sql, ["연습3 업데이트2", 3], function(err, result){
    if(err) throw err;

    console.log(result)
})

con.end();