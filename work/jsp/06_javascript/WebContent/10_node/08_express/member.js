

var express = require("express");
var router = express.Router();

module.exports = router;

router.get("/list.do", function(req, res){
    console.log("회원");
    res.end();
})

router.get("/join.do", function(req, res){
    console.log("등록");
    res.end();
})










