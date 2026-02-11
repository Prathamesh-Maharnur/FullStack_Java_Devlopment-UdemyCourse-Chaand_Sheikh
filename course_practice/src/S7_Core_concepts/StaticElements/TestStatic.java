package  S7_Core_concepts.StaticElements;
public class TestStatic{
    static int staticVariable = 0;
    public static int getStaticVariable(){
        return staticVariable;
    }

    public static void setStaticVariable(int staticVariable){
        TestStatic.staticVariable= staticVariable;
    }
}