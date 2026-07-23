const message = function(name="Shyam", topic="Java", experience="fun"){
    console.log(`This is me, ${name}`);
    console.log(`I am learning ${topic}`);
    console.log(`And this is ${experience}`)
};

message();
console.log("--------------------------------");
message("Prathamesh");
console.log("--------------------------------");
message("Prathamesh", "SpringBoot");
console.log("--------------------------------");
message("Prathamesh", "SpringBoot", "Great");
console.log("--------------------------------");
message("Prathamesh", "SpringBoot", "Amazing", "DummyWord");

