var matrix : number[][] = [[45,5,65] , [11,32,9] , [78,8,35]];
//console.log(matrix);
console.log(matrix[0][0],matrix[0][1],matrix[0][2]);
console.log(matrix[1][0],matrix[1][1],matrix[1][2]);
console.log(matrix[2][0],matrix[2][1],matrix[2][2]);

//printing upper diagonal matrix.
function upperDiagMatrix(){
    console.log("upper diagonal matrix:");
    for(let i = 0; i < 3; i++){
        for(let j = 0; j < 3-i; j++)
            console.log(matrix[i][j]);  
    }
    
}
upperDiagMatrix();
