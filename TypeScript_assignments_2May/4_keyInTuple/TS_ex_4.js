"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var newTp = { 1: "html",
    2: "css",
    3: "js",
    4: "jquery" };
console.log(newTp);
userinput.question('enter a key', function (key) {
    for (var i in newTp) {
        if (i == key) {
            console.log(i + ": " + newTp[i]);
        }
    }
    userinput.close();
});
