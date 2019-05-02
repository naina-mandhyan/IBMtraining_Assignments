"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
userinput.question('enter a number', function (num) {
    var n = parseInt(num);
    var sum = 0;
    for (var i = 0; i < 100; i++) {
        sum = sum + n;
        n = n + 1;
    }
    console.log("sum of first 100 numbers from " + num + " is " + sum);
    userinput.close();
});
//function sumhundred(){
//  let res = 0;
// for(let i = 1; i <= 100; i++){
//   res = res + i;
//}
//return res;
//}
//console.log(sumhundred());
