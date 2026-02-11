package  S6_Object_oriented_programming.InheritanceExample.animal;

public class Animal{
    private float height;
    private float weight;
    private String animalType;
    private String bloodType;

    public Animal(){
        height = 0.0f;
        weight = 0.0f;
        animalType = "unknown";
        bloodType = "unknown";
    }

    public float getHeight(){
        return height;
    }

    public float getWeight(){
        return weight;
    }

    public String getAnimalType(){
        return animalType;
    }

    public String getBloodType(){
        return bloodType;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setAnimalType(String animalType){
        this.animalType = animalType;
    }

    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }

    public String showInfo(){
        return "Animal={"+
                "height="+height+
                ", weight="+weight+
                ", blood type='"+bloodType+'\''+
                ", animal type='"+animalType+'\'';
    }
}