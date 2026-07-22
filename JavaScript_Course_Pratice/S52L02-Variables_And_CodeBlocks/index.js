let year = 2026;

console.log("Start Global console log: "+year+" month: "+month);

if(true){
    year = 2027;
    var month =1;
    console.log("Inside 1st condition: "+year+" month: "+month);

    if(true){
        let year = 2028;
        console.log("Inside 2nd condition: "+year+" month: "+month);
    }
}
console.log("End Global console log: "+year+" month: "+month)