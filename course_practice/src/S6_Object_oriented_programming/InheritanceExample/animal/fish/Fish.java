package S6_Object_oriented_programming.InheritanceExample.animal.fish;
import S6_Object_oriented_programming.InheritanceExample.animal.Animal;

public class Fish extends Animal{
    private String habitat;
    private boolean gills;

    public Fish(){
        setHeight(5);
        setWeight(5);
        setAnimalType("Fish");
        setBloodType("cold-blooded");
        habitat = "ocean";
        gills = true;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isGills() {
        return gills;
    }

    public void setGills(boolean gills) {
        this.gills = gills;
    }

    @Override
    public String showInfo() {
        return "Fish{" +
                "habitat='" + habitat + '\'' +
                ", gills=" + gills +
                "} " + super.showInfo();
    }
}
