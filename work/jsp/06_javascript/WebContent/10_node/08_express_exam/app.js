var express = require("express");
var app = express();
var bodyParser = require("body-parser");


var board = require("./routes/board");
app.use("/board", board);
app.set('view engine', 'pug');
app.use(bodyParser.urlencoded({extended:true}));


app.get("/", function(req, res){
    res.render(__dirname + "/view/index");
})


app.listen(10001, function(){
    console.log("08_express_exam 구동중");
})