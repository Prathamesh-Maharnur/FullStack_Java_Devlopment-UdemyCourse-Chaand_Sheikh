package S7_Core_concepts.InterfaceWithPolymorphismAndMultipleInheritance;

public class Iphone implements Phone, IOS{

    @Override
    public String airdrop() {
        return "copy and paste anywhere";
    }

    @Override
    public String processor() {
        return "A15";
    }

    @Override
    public int spaceInGb() {
        return 256;
    }


}