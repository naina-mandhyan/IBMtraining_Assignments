import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

// sum of digits of a given number by the user.
userinput.question('enter an number',(num) => {
    let n = num.split('');
    let sod:number = 0;
    let nm: number;
    for(let i=0; i < n.length; i++)
    {
        nm = parseInt(n[i]);
        sod = sod + nm;
    }
    console.log("sum of digits = " + sod);
    userinput.close();
});