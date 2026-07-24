let add = (a,b) =>{
    console.log("This is arrow function");
    return (a+b);
}

let result = add(10,20);
console.log(`The result is: ${result}`);

let square = a => a*a;
console.log(`Square = ${square(10)}`);