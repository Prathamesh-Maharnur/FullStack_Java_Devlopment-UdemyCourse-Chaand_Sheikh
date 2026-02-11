package S7_Core_concepts.ExceptionHandling.throwKeyword;

class throwKeyword{
    public static void main(String args[]){
        throwKeyword main = new throwKeyword();
        try{
            main.doSomething();
        }
        finally{
            System.out.println("This concept is not widely used!!!");
        }
    }

    public void doSomething() throws RuntimeException{
        String s = "zero";
        if(s.equals("zero")){
            throw new RuntimeException();
        }
        System.out.println("Do Something!!!");
    }
}