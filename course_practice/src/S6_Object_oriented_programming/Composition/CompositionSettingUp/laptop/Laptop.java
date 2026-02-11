package S6_Object_oriented_programming.Composition.CompositionSettingUp.laptop;

import S6_Object_oriented_programming.Composition.CompositionSettingUp.laptop.components.GraphicCard;
import S6_Object_oriented_programming.Composition.CompositionSettingUp.laptop.components.Processor;

public class Laptop{
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicCard graphicCard;
    private String opticalDrive;
     private String keyboard;

     public Laptop(){
         this.screen = 15.6f;
         this.processor = new Processor();
         this.ram = "16GB";
         this.hardDrive = "2TB";
         this.graphicCard = new GraphicCard();
         this.opticalDrive = "Multi Layer";
         this.keyboard = "Backlit";
     }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicCard, String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicCard=" + graphicCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}