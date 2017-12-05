/*
    JavaScript + nodejs + dbms(mysql) - MySql 데이터 베이스 연동

    mysql 모듈 다운로드 
    npm install mysql

    모듈로딩
    require("mysql")
*/

var mysql = require("mysql");

var con = mysql.createConnection({
    //localhost, 3306 접근시에는 생략이 가능
    //host: "localhost",
    //port: 3306,
    
    user: "hanbit",
    password: "hanbit"
})

//연결
con.connect();

//sql실행하기 - 비동기적 실행
con.query("create database hanbit", function(err, result) {
    if(err)
    {
        console.log("데이터베이스 생성중 에러발생");
        console.log(err);
        return;
    }
    console.log("데이터베이스 생성 완료")
});

//데이터 베이스 연결 끊기
con.end();













