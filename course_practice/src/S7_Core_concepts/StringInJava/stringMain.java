package S7_Core_concepts.StringInJava;

class StringInJava{
    public static void main(String args[]){
        String a = "study";
        String b = "easy";
        String c = a+b;
        System.out.println(c);
        if(c == "studyeasy"){
            System.out.println("Great!!!");
        }
        else{
            System.out.println("What just happened!!!");
        }
    }
}