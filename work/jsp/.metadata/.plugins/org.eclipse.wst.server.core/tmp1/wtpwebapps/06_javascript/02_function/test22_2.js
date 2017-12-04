/*
    클로저

    - 함수내의 지역변수를 함수 외부에서 사용할 수 있게 해주는 기술
    - 생명주기가 종료된 함수의 변수를 참조하는 기술
*/

function nextId()
{
    var id  = 1;
    return function () { return id++ };
}

var id1 = nextId();
console.log(id1());
console.log(id1());

var id2 = nextId();
console.log(id2());
console.log(id2());