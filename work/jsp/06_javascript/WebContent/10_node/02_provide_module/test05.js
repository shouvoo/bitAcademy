//crypto : 해쉬 생성 및 암호화 처리

var crypto = require("crypto");

//해쉬 알고리즘 : sha1, md5, sha256, sha512
var sha1 = crypto.createHash("sha1");

//암호화 대상 문자열 : 평문
var msg = "sbc1234";

//등록 
sha1.update(msg);

//암호화 처리하기
var output = sha1.digest("base64"); // base64, hex, latin1

console.log("원본 %s", msg);
console.log("해쉬 %s", output);