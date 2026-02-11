package S13_LambdaExpressions.LambdaRefresher;

interface Data{
    public int demo(int x, float y);
}

class LambdaRefresherMain{
    public static void main(String[] args){
        Data data = (x,y) -> {
            System.out.println("Value of y is "+y);
            System.out.println("Value of x will be returned by the method");
            return x;
        };

        System.out.println(data.demo(10,23.467f));
    }
}