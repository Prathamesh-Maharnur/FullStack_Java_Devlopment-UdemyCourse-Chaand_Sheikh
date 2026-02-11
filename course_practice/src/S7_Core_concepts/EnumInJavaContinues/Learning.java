package S7_Core_concepts.EnumInJavaContinues;

public enum Learning{
    JSP(1),COLLECTIONS(2),COREJAVA(3),GENERICS(4),MULTITHREADING(5);
    private int i;

    Learning(int i){
        this.i = i;
    }

    public int getI(){
        return i;
    }
}