package S13_LambdaExpressions.LambdaExpressionOverviewMain;

interface lambda{
    public void demo();
}
class LambdaExpressionOverviewMain{
    public static void main(String[] args){
        lambda l1 = () -> { System.out.println("Statement 01");
                            System.out.println("Statement 02");};
        l1.demo();
    }
}