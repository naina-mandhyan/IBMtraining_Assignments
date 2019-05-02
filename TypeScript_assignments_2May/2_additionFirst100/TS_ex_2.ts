import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

// sum of first hundred numbers from given input number.
userinput.question('enter a number', (num) => {
    let n = parseInt(num);
    let sum:number = 0;
    for (let i=0; i < 100; i++){
        sum = sum + n;
        n = n + 1;
    }
    console.log("sum of first 100 numbers from " + num + " is " + sum);
    userinput.close();
});

// sum of frst 100 natural numbers.
//function sumhundred(){
  //  let res = 0;
   // for(let i = 1; i <= 100; i++){
     //   res = res + i;
    //}
    //return res;
//}
//console.log(sumhundred());