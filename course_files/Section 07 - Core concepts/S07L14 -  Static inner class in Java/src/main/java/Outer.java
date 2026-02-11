
public class Outer {

    public static class Inner {
        public static int x = 10;
        public static void staticMessage() {
            System.out.println("Hello static");
        }
    }

    public class NonStaticInner{
        public void nonStaticMessage() {
            System.out.println("Hello non static");
        }
    }

}
