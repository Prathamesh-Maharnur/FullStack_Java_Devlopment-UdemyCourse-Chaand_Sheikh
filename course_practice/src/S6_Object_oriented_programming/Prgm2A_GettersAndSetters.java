class Prgm2A_GettersAndSetters{
    public static void main(String args[]){
        Prgm2B_cars car = new Prgm2B_cars();
        car.setDoors(4);
        System.out.println(car.getDoors());
    }
}

class Prgm2B_cars {
    private int doors;
    private String engine;
    private String driver;
    private int speed;


    public void setDoors(int doors){
        doors = doors;          // java cannot differentiate between instance variable and formal argument
    }                           // need to use 'this' operator

    public int getDoors(){
        return doors;
    }
}