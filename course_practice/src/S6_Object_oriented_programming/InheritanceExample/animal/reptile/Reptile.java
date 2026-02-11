package S6_Object_oriented_programming.InheritanceExample.animal.reptile;
import S6_Object_oriented_programming.InheritanceExample.animal.Animal;

public class Reptile extends Animal{
    private String skin;
    private boolean backbone;
    private String eggs;

    public Reptile(){
        setHeight(5);
        setWeight(200);
        setAnimalType("Reptile");
        setBloodType("cold-blooded");
        skin = "dry";
        backbone = true;
        eggs = "hard-shelled";
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public boolean isBackbone() {
        return backbone;
    }

    public void setBackbone(boolean backbone) {
        this.backbone = backbone;
    }

    public String getEggs() {
        return eggs;
    }

    public void setEggs(String eggs) {
        this.eggs = eggs;
    }

    @Override
    public String showInfo() {
        return "Reptile{" +
                "skin='" + skin + '\'' +
                ", backbone=" + backbone +
                ", eggs='" + eggs + '\'' +
                "} " + super.showInfo();
    }
}