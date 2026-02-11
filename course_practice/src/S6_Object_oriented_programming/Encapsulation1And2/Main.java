package S6_Object_oriented_programming.Encapsulation1And2;

class Main{
    public static void main(String args[]){
        Person p1 = new Person("Prathamesh",20,"Male");
        p1.setName("Pragyan");
        p1.setAge(-30);
        System.out.println(p1);
        p1.setAge(167);
        System.out.println(p1);
        p1.setAge(35);
        System.out.println(p1);
    }
}