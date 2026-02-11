import org.studyeasy.John;
import org.studyeasy.Person;
import org.studyeasy.Pooja;

public class Main {
    public static void main(String[] args) {

        Person person = new Pooja();
//        person.eat();
//        person.speak();

        Person p2 =new Person() {
            @Override
            public void eat() {
                System.out.println("Eat food!!!");
            }
        };
        p2.speak();
        p2.eat();
    }
}
