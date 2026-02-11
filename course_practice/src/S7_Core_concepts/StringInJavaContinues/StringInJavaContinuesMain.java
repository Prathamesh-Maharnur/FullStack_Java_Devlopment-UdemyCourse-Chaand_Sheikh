package S7_Core_concepts.StringInJavaContinues;

class StringInJavaContinuesMain{
    public static void main(String args[]){
        String a = "study";
        String b = "easy";
        String c = a.concat(b);
        System.out.println(c);
        if(c.equals("studyeasy")){
            System.out.println("Great!!!");
        }
        else{
            System.out.println("What just happened!!!");
        }

        String str1 = "Prathamesh";
        String str2 = "Prathamesh";

        if(str1 == str2){
            System.out.println("str1 and str2 Matched!!!");
        }

        String str3 = new String("Prathamesh");
        String str4 = new String("Prathamesh");

        if(str3 == str4){
            System.out.println("str3 and str4 Matched!!!");
        }
        else{
            System.out.println("str3 and str4 NOT matched!!!");
        }

        if(str3.equals(str4)){
            System.out.println("both str3 and str4 matched!!!");
        }
        else{
            System.out.println("both str3 and str4 are different!!!");
        }
    }
}