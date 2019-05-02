"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
userinput.question('enter an number', function (num) {
    var n = num.split('');
    var sod = 0;
    var nm;
    for (var i = 0; i < n.length; i++) {
        nm = parseInt(n[i]);
        sod = sod + nm;
    }
    console.log("sum of digits = " + sod);
    userinput.close();
});
