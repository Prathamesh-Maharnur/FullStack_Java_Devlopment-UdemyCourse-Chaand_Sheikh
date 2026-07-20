let name = "Prathamesh";
let year = 2026;
let students = ["Mayur", "Vinayak", "Vivek", "Jitendra"];

if(name == "Prathamesh"){
    console.log(`My name is ${name}`);
}else{
    console.log("name is not Prathamesh");
}

console.log("--------------------------");

/* 
    There is NO "else-if" keyword in JS
    "else if' is actually:  
    
    if(){
    
    }    
    else{ 
        if{

        }else{

        }
    } 

*/    

if(year == 2026){
    console.log("The year is 2026");
}else if(year > 2026){
    console.log("The year is greater than 2026")
}else{
    console.log("The year is less than 2026");
}

console.log("--------------------------");

if(students.length != 5){
    console.log("The students has elements less or more than 5")
}else{
    console.log("The students contains 5 elements")
}