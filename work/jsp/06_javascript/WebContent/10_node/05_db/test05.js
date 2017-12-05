var mysql = require("mysql");

var con = mysql.createConnection({
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
})

var sql = "delete from tb_board where no=?"

con.connect();

con.query(sql, [4], function(err, result){
    if(err) throw err;
    console.log(result);
})

con.end();