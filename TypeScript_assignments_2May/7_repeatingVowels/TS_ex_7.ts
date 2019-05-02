import * as readline from 'readline';

let userinput = readline.createInterface({
    input:process.stdin,
    output:process.stdout
});

// finding the number of repeating vowels.
userinput.question('enter a string', (str) => {
    let arr = str.split('');
    let a:number = 0;
    let e:number = 0;
    let i:number = 0;
    let o:number = 0;
    let u:number = 0;   
    for( let j=0; j < arr.length; j++){
        switch(arr[j])
        {
            case 'a' : a++; break;
            case 'e' : e++; break;
            case 'i' : i++; break;
            case 'o' : o++; break;
            case 'u' : u++; break;
        }
    }
        if(a>1){
            console.log('a ' + a + ' times');
        }
        if(e>1){
            console.log('e ' + e + ' times');
        }
        if(i>1){
            console.log('i ' + i + ' times');
        }
        if(o>1){
            console.log('o ' + o + ' times');
        }
        if(u>1){
            console.log('u ' + u + ' times');
        }
        userinput.close();
});