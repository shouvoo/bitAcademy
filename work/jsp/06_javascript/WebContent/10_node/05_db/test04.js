var mysql = require("mysql");

var con = mysql.createConnection({
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
})

con.connect();

var sql = "insert into tb_board(writer, title, content)" + 
            "values(?, ?, ?)";

con.query(sql, ["test1234", "node insert", "success"], function(err, result){
    if(err) throw err;
    console.log(result);
})

con.end();