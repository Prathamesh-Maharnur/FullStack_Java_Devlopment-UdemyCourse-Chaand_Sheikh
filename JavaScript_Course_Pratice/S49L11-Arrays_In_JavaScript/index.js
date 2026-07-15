let names = ["Prathamesh", "Mayur", "Vinayak"];

let students = ["Chinmay", "Prathamesh", "Jitendra"];

console.log(names);
names.push("Vivek");

names.pop();
console.log(names);

names = names.concat(students)
console.log(names);

console.log(names.length);

names.length = 10;
console.log(names);

names.length = 4 ;
console.log(names);
