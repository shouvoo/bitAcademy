

var express = require("express");
var router = express.Router();

module.exports = router;


router.get("/list.do", function(req, res){
    console.log("게시판 목록");
    res.end();
})

router.get("/write.do", function(req, res){
    console.log("게시판 등록");
    res.end();
})