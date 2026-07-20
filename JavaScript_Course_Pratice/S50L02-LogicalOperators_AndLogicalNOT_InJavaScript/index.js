const password = "Prathamesh@123";

if(((password.length >= 8) && (password.length <=200)) && !password.includes('@')){
    console.log("Password is valid");
}else if(password.includes("@")){
    console.log("Password contains special character");
}else if(password.length < 8 || password.length >20){
    console.log("Password is not of valid length");
}else{
    console.log("Password is invalid")
}