/*
    request 모듈 : 외부모듈

    외부모듈
    npm install request
*/

var request = require('request');
request('http://www.naver.com', function (error, response, body) 
{
  if(error || response.statusCode != 200)
  {
    console.log("요청시 에러 발생")
    console.log('error:', error); // Print the error if one occurred
    return;
  }

  //console.log('statusCode:', response && response.statusCode); // Print the response status code if a response was received
  console.log('body:', body); // Print the HTML for the Google homepage.
});