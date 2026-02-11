package S7_Core_concepts.InterfaceWithPolymorphismAndMultipleInheritance;

public class SamsungPhone implements Phone,Android{

    @Override
    public String whatsapp() {
        return "send messages for free";
    }

    @Override
    public String processor() {
        return "SD1000";
    }

    @Override
    public int spaceInGb() {
        return 512;
    }
}