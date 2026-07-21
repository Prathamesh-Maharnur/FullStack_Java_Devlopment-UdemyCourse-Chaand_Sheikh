const values_of_pie = [2.7, 3.138542, 3.18, 3.14, 7.88, 4.1, 6.0, 3.2];

for(let i =0; i<values_of_pie.length; i++){
    if((values_of_pie[i]<3) || (values_of_pie[i]>4)){
        continue;
    }

    if(values_of_pie[i] == 3.14){
        console.log("We found the value of pie: ", values_of_pie[i]);
        break;
    }
    console.log(values_of_pie[i]);
}