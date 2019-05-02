"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
userinput.question('Enter a number', function (num) {
    var n = parseInt(num);
    var fact = 1;
    for (var i = 1; i <= n; i++) {
        fact = fact * i;
    }
    console.log("factorial of " + n + " is " + fact);
    userinput.close();
});
