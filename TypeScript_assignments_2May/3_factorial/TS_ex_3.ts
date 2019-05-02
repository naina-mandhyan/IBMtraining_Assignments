import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

// factorial of user given number.
userinput.question('Enter a number',(num) => {
    let n = parseInt(num);
    let fact:number = 1;
    for( let i = 1 ; i <= n; i++){
        fact = fact * i;
    }
    console.log("factorial of "+ n +" is " + fact);
    userinput.close();
});