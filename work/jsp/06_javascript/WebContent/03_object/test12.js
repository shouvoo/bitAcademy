/*
    객체퀴즈
*/



function MyMap()
{
    this.id;
    this.name;
}

MyMap.prototype = {put : (key, val) => { this[key] = val;},                                            
                    size : () => { return Object.keys(this).length},
                    del : (key) => {delete this[key];},
                    get : (id) => { return this.id },
                    clear : () => {delete this.name}};
MyMap.prototype.constructor = MyMap;

var mData = new MyMap();

mData.put("id", "sss");
mData.put("name", "홍짜장");

console.log(mData.size()); // 2
console.log(mData.get("id")); // sss
mData.del("id");
console.log(mData.get("id")); // undefined
mData.clear();
console.log(mData.size()); //0




