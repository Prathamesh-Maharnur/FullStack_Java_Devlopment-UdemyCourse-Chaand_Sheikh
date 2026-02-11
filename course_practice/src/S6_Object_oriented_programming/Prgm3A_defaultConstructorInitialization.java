class Prgm3A_defaultConstructorInitialization{
    public static void main(String args[]){
        Prgm3B_cars car = new Prgm3B_cars();
        System.out.println("driver = "+car.driver);
        System.out.println("test attribute = "+car.testAttr);
        System.out.println("test attribute2 = "+car.testAttr2);
    }
}

class Prgm3B_cars{
    public String doors;
    public String engine;
    public String driver;
    public int speed;
    public float testAttr;
    public boolean testAttr2;
}