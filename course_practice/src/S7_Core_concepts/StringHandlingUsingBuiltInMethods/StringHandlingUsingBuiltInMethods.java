package S7_Core_concepts.StringHandlingUsingBuiltInMethods;

class StringHandlingUsingBuiltInMethods{
    public static void main(String args[]){
        String a,b,c;
        a = "Study";
        b = "easy";
        c = a.concat(b);
        if(c.equals("Studyeasy")){
            System.out.println("Studyeasy");
        }
        else{
            System.out.println("StusyHard!!!");
        }

        System.out.println("Before replacement: "+c);
        System.out.println("After replacement: "+c.replace("easy"," with dedication"));
    }
}