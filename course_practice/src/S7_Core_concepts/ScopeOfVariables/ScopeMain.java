package S7_Core_concepts.ScopeOfVariables;

class ScopeMain{
    private int x = 20;
    private static int y = 30;
    public void display(int x){
        // this.x represents the class variable x;
        this.x = x;
    }
    public static void main(String args[]){
        {
            int x = 10;
            System.out.println("Inside block Inside Method: x = "+x);
            System.out.println("Inside block Inside Method: y = "+y);
        }
        System.out.println("********");
        // we need to create object of ScopeMain because psvm() is a static method!!!
        System.out.println("Outside block Inside Method: x = "+new ScopeMain().x);
        System.out.println("Outside block Inside Method: y = "+y);

        System.out.println("********");
        ScopeMain s = new ScopeMain();
        s.display(7);
        System.out.println("Display method called: x = "+s.x);
    }
}