import org.studeasy.Door;

public class Main {
    public static void main(String[] args) {


        if (new Door().isLocked(args[0])){
            System.out.println("Door is locked");
        }else{
            System.out.println("Door is unlocked");
        }
    }
}
