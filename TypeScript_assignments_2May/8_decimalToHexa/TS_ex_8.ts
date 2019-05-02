import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

//converting a decimal number to hexadecimal.
userinput.question('enter a decimal number', (decNum) => {
    let n = parseInt(decNum);
    let rem:number;
    let hexstr: string;
    let hexdec:string='';
    while(n!=0){
        rem = Math.floor( n % 16);
        n = Math.floor( n / 16 );
        if(rem >= 10){
            switch(rem){
                case 10: hexstr = 'A'; break;
                case 11: hexstr = 'B'; break;
                case 12: hexstr = 'c'; break;
                case 13: hexstr = 'D'; break;
                case 14: hexstr = 'E'; break;
                case 15: hexstr = 'F'; break;
            }
            hexdec = hexstr + hexdec;
        }
        else{
            hexdec = rem + hexdec; 
        }
    }
    console.log(hexdec);
    userinput.close();
});