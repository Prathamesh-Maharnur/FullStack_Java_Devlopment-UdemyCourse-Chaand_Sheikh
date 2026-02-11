package S6_Object_oriented_programming.Composition.CompositionSettingUp.laptop.components;

public class GraphicCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicCard(){
        this.brand = "Nvdia";
        this.series = 1650;
        this.memory = "7GB";
    }

    public GraphicCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GraphicCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}