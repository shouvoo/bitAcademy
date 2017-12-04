// 클로저 연습

function calClosure(val1, val2)
{
    return (comm) => {
        switch(comm)
        {
            case ("+") : 
                return val1 +  val2
                break;

            case ("-") : 
                return val1 - val2
                break;

            case ("*") : 
                return val1 * val2
                break;

            case ("/") : 
                return val1 / val2
                break;

        }
    };
}

var cal = calClosure(10, 2);
console.log(cal("+")); // 12
console.log(cal("-")); // 8
console.log(cal("*")); // 20
console.log(cal("/")); // 6




