package S13_LambdaExpressions.LambdaExpressionsWithPredicates;

import java.util.function.IntPredicate;

class LambdaExpressionsWithPredicates{
    public static void main(String[] args){
       IntPredicate predicate = new IntPredicate() {
            @Override
            public boolean test(int value){
                if(value < 18){
                    return true;
                }
                else{
                    return false;
                }
            }
       };

        System.out.println(predicate.test(10));

        System.out.println("*******************");

        IntPredicate lessThan18 = value -> value < 18;
        IntPredicate moreThan18 = value -> value > 18;

        System.out.println(lessThan18.and(moreThan18).negate().test(17));
    }
}