package S7_Core_concepts.EnumInJava;

class EnumInJavaMain{
    public static void main(String args[]){
        Learning learning = Learning.COLLECTIONS;
        System.out.println(learning);
        System.out.println(learning.GENERICS);

        System.out.println(Learning.JSP);

        System.out.println("\n***************************\n");

        switch(learning){
            case COLLECTIONS -> System.out.println("Collections");
            case COREJAVA -> System.out.println("Core Java");
            case JSP -> System.out.println("JSP");
            case GENERICS -> System.out.println("Generics");
            case MULTITHREADING -> System.out.println("Multi Threading");
        }
    }
}