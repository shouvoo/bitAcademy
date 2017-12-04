//id=aaaa&pass=1111
//querystring : 쿼리에 대한 파싱 처리

var qs = require("querystring");

var data = "id=aaaa&pass=1111";

var param = qs.parse(data);
console.log(param.id);