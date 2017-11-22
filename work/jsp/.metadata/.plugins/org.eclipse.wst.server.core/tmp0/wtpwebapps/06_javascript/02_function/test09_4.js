/*

*/

function arrFor(arr, cb)
{
    for(let i = 0; i < arr.length; i++)
    {
        cb(i, arr[i]);
    }
}



let arr = [1, 2, 3, 4 ,5];
let sum = 0;
//arrFor(arr, (i, val) => { sum += val });
arrFor(arr, (i, val) => { if(i % 2 == 0) sum += val });
console.log("홀수번째 합 : ", sum);

arr.forEach(function(val, i, array) {  })


/*
for(let i = 0; i < arr.length; i++)
{
    sum += arr[i];
}

console.log(sum);
*/














