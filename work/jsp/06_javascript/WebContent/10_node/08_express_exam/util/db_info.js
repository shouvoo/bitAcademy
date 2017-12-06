
module.exports = function()
{
    var mysql = require("mysql");
    con.connect();
    console.log("dddddddd");
    var con = mysql.createConnection({
        
        user: "hanbit",
        password: "hanbit",
        database: "hanbit"
    });
}

