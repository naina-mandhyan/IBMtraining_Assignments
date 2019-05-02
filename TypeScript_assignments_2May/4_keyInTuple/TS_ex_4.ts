import * as readline from 'readline';

let userinput = readline.createInterface({
input:process.stdin,
output:process.stdout
});

var newTp = {   1 : "html",
                2 : "css",
                3 : "js",
                4 : "jquery" }

console.log(newTp);

//finding key in tuple.
userinput.question('enter a key', (key) => {
    for(var i in newTp)	{
		if(i == key)	{
			console.log(`${i}: ${newTp[i]}`);   
        }
    }   
    userinput.close();
});