package S7_Core_concepts.AnonymousInnerClass;


class AnonymousInnerClass_Main{
    public static void main(String args[]){
        new Lock(){
            public void isUnlocked(String key){
                if(key.equals("qwerty")){
                    System.out.println("The Shop is open");
                }
                else{
                    System.out.println("The shop is closed");
                }
            }
        }.isUnlocked("qwerty");
    }
}