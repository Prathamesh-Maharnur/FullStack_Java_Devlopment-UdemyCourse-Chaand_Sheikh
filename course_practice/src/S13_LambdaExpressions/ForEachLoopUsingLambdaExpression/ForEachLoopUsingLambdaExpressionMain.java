package S13_LambdaExpressions.ForEachLoopUsingLambdaExpression;

import java.util.Arrays;
import java.util.List;

class Data{
    String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

class ForEachLoopUsingLambdaExpressionMain{
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(4,8,2,78,81,19);
        list1.forEach(i -> System.out.println(i));

        System.out.println("******************************************");

        List<Data> list2 = Arrays.asList(new Data("Vinayak"), new Data("Prathamesh"), new Data("Mayur"));
        list2.forEach(temp ->{
            if(temp.getName().equals("Prathamesh")){
                System.out.print("Learning java full stack: ");
            }
            System.out.println(temp.getName());
        });
    }
}