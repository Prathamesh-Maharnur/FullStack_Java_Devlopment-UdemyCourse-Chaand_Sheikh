package S13_LambdaExpressions.CreatingThreadUsingLambda;

class CreatingThreadUsingLambda{
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            System.out.println("Statement 01");
            System.out.println("Statement 02");
        });
        t1.start();
    }
}