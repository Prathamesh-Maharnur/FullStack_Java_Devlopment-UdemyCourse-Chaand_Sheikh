package S7_Core_concepts.Anonymous_Object;

public class AnonymousObjectMain{
    public static void main(String args[]){
        if(args[0].equals(new Lock().getCode())){
            System.out.println("The door is now open");
        }
        else{
            System.out.println("The door is closed");
        }
    }
}