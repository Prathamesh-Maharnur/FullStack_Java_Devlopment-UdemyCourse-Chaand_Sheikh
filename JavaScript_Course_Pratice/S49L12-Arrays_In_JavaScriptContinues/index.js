let names = ["Prathamesh", "Mayur", "Vinayak"];

let students = ["Chinmay", "Prathamesh", 60, 30];

console.log(names);

names2 = names + students;
console.log(names2);
console.log(typeof names2);

names3 = names.concat(students);
console.log(names3);
console.log(typeof names2);

console.log(names.toString());

names.sort();
console.log(names);

names3.sort();
console.log(names3);

console.log(names.indexOf("Vinayak"));

console.log(names.join(""));

console.log(names.join("-"));

names.reverse();
console.log(names);
