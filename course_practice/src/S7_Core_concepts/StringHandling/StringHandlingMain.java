package S7_Core_concepts.StringHandling;

class StringHandling{
    public static void main(String args[]){
        String a,b,c;
        a = "Study";
        b = "easy";
        c = a+b;
        if(c == "Studyeasy"){
            System.out.println("Studyeasy");
        }
        else{
            System.out.println("StudyHard");
        }
    }
}