class Prgm6A_constructors{
    public static void main(String args[]){
        Prgm6B_cars car = new Prgm6B_cars("closed","on","seated",10);
        System.out.println("car1 = "+car.run());
        Prgm6B_cars car2 = new Prgm6B_cars();
        System.out.println("car2 = "+car2.run());

    }
}

class Prgm6B_cars{
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Prgm6B_cars(){
        doors = "closed";
        engine = "off";
        driver = "away";
        speed = 0;
    }

    public Prgm6B_cars(String doors, String engine, String driver, int speed){
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String run(){
        if(doors.equals("closed") && engine.equals("on")  && driver.equals("seated") && speed > 0){
            return "running";
        }
        else{
            return "not running";
        }
    }
}