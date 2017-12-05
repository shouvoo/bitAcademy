var mysql = require("mysql");

var con = mysql.createConnection({
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
})

//connect 가 없으면 자동 발생시켜 준다
con.connect();

var sql = "select no, title, writer \
            from tb_board\
            order by no desc\
            limit ?, ?";

con.query(sql, [0, 2], function(err, result){
    if(err)
    {
       throw err;
    }

    result.forEach(row => {
        console.log(row.no, row.title, row.writer)
    });
})

con.end();