class Prgm7A_defaultConstructor{
    public static void main(String args[]){
        Prgm7B_smartphones phone1 = new Prgm7B_smartphones();
        System.out.println(phone1.getBrand());
        Prgm7B_smartphones phone2 = new Prgm7B_smartphones("Samsung");
        System.out.println(phone2.getBrand());
    }
}

class Prgm7B_smartphones{
    private String brand="oneplus";

    // default constructor
    public Prgm7B_smartphones(){
//        brand = "apple";
    }

    // parametrized constructor
    public Prgm7B_smartphones(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}