module.exports = function()
{
    console.log("express 호출")
    return {
        use () {console.log("use 호출") },
        get () { console.log("get 호출")},
        post () { console.log("post 호출") }
    }
}
