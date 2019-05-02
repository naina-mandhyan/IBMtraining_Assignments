"use strict";
exports.__esModule = true;
var readline = require("readline");
var userinput = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
userinput.question('enter a decimal number', function (decNum) {
    var n = parseInt(decNum);
    var rem;
    var hexstr;
    var hexfinal = '';
    while (n != 0) {
        rem = Math.floor(n % 16);
        n = Math.floor(n / 16);
        if (rem >= 10) {
            switch (rem) {
                case 10:
                    hexstr = 'A';
                    break;
                case 11:
                    hexstr = 'B';
                    break;
                case 12:
                    hexstr = 'c';
                    break;
                case 13:
                    hexstr = 'D';
                    break;
                case 14:
                    hexstr = 'E';
                    break;
                case 15:
                    hexstr = 'F';
                    break;
            }
            hexfinal = hexstr + hexfinal;
        }
        else {
            hexfinal = rem + hexfinal;
        }
    }
    console.log(hexfinal);
    userinput.close();
});
