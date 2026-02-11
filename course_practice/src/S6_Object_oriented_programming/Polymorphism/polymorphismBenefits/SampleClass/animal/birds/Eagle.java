package S6_Object_oriented_programming.Polymorphism.polymorphismBenefits.SampleClass.animal.birds;

public class Eagle extends Birds{
    @Override
    public String showInfo() {
        return "Eagle{} " + super.showInfo();
    }
}