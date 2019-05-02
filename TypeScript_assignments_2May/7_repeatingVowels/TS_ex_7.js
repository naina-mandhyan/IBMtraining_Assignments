"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
userinput.question('enter a string', function (str) {
    var arr = str.split('');
    var a = 0;
    var e = 0;
    var i = 0;
    var o = 0;
    var u = 0;
    for (var j = 0; j < arr.length; j++) {
        switch (arr[j]) {
            case 'a':
                a++;
                break;
            case 'e':
                e++;
                break;
            case 'i':
                i++;
                break;
            case 'o':
                o++;
                break;
            case 'u':
                u++;
                break;
        }
    }
    if (a > 1) {
        console.log('a ' + a + ' times');
    }
    if (e > 1) {
        console.log('e ' + e + ' times');
    }
    if (i > 1) {
        console.log('i ' + i + ' times');
    }
    if (o > 1) {
        console.log('o ' + o + ' times');
    }
    if (u > 1) {
        console.log('u ' + u + ' times');
    }
    userinput.close();
});
