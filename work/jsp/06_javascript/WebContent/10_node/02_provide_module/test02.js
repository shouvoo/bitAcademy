//path 모듈 : 경로에 대한 다양한 처리

var path = require("path");

/*console.log(path.join("c:/test"));
console.log(path.join("c:/test", "/aa/bb", "/index.js"));
console.log(path.join("c:/test/", "/aa/bb", "index.js"));*/

var fileName = "c:/test/aa/bb/index.js";
console.log(path.dirname(fileName)); //디렉토리
console.log(path.extname(fileName)); //확장자
console.log(path.basename(fileName)); //파일명


console.log(path.basename(fileName, ".js")); // 파일명(확장자 제거)

console.log(path.basename(fileName, path.extname(fileName)));