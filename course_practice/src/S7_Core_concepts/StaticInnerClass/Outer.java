package S7_Core_concepts.StaticInnerClass;

public class Outer{
    public static class Inner{
        public static int x = 10;
        public String name = "Prathamesh";

        public static int getX(){
            return x;
        }

        public static void setX(int x){
            Outer.Inner.x = x;
        }

        public void StaticClass_NonStaticMethod(){
            System.out.println("StaticClass_NonStaticMethod:\t"+name+"\t"+x);
        }
    }

    public class InnerNonStatic{
        public void display(){
            System.out.println("Hello, Non static class method!");
        }
    }
}