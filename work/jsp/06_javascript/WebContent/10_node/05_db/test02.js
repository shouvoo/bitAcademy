var mysql = require("mysql");

var con = mysql.createConnection({
    user: "hanbit",
    password: "hanbit",
    database: "hanbit"
})

con.connect();

var sql = "select no, title, writer \
                from tb_board\
                order by no desc";

con.query(sql, function(err, result){
    if(err)
    {
        console.log("조회중 에러 발생");
        console.log(err);
        return;
    }
    console.log("조회 성공");
    console.log(result);

    /*for(var i = 0; i < result.length; i++)
    {
        var row = result[i];
        console.log(row.no, row.title, row.writer);
    }*/

    result.forEach(element => {
        console.log(element.no, element.title, element.writer);
    });
});

con.end();