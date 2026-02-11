class Prgm5A_runClassMethods{
    public static void main(String args[]){
        Prgm5B_cars car = new Prgm5B_cars();
        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("On");
        car.setSpeed(4);
        System.out.println(car.getSpeed());
        System.out.println(car.run());
    }
}

class Prgm5B_cars{
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /*
     If default constructor are used then all variable are assigned 'null' this creates
     'NullPointerException' in the program !!!
     */
    public String run() {
        if (doors.equals("closed") && engine.equals("On")
                && driver.equals("seated") && speed > 0) {
            return "running";
        }
        else{
            return "not running";
        }
    }
}