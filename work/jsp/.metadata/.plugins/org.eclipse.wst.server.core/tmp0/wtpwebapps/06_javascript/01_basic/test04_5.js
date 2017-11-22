//호이스팅 퀴즈
'use strict'
console.log(id);

var id = "테스트";
 console.log(id);

 /*
    호이스팅 과정

    컴파일 단계
    var id <- 6줄

    실행 단계
    console.log(id) - undefined; - 3줄
    console.log(id) - 테스트; - 6줄


 */