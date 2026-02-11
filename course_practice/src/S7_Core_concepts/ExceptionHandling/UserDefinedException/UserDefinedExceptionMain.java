package S7_Core_concepts.ExceptionHandling.UserDefinedException;

class UserDefinedExceptionMain{
    int age = 0;
    String name = " ";

    public static void main(String args[]){
        UserDefinedExceptionMain main = new UserDefinedExceptionMain();
        try{
            main.doSomething();
        }
        catch(NullException e){
            System.out.println("name = "+main.name);
            System.out.println("Name cannot be null!!!");
        }
        catch(ZeroValueException e){
            System.out.println("age = "+main.age);
            System.out.println("Age cannot be zero!!!");
        }
        catch(ArithmeticException e){
            System.out.println("age = "+main.age);
            System.out.println("Age cannot be negative!!!");
        }

    }

    public void doSomething() throws NullException, ArithmeticException, ZeroValueException {
        if(name.equals(" ")){
            throw new NullException();
        }
        else if(age == 0){
            throw new ZeroValueException();
        }
        else if (age < 0){
            throw new ArithmeticException();
        }
        else{
            throw new RuntimeException();
        }

    }
}

class ZeroValueException extends Exception{

}

class ArithmeticException extends Exception{

}

class NullException extends Exception{

}