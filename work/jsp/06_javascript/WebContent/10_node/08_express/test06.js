var express = require("express");
var app = express();

var board = require("./board");
var member = require("./member");

app.use("/board", board);
app.use("/member", member);

app.get("/", function(req, res){
    console.log("루드");
    res.end();
})


app.listen(3000, function(){
    console.log("구동중");
})