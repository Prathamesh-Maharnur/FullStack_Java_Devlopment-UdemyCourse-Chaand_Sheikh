package S7_Core_concepts.FinalKeywordWithDataMembers;

class FinalDataMember_Main{
    public static void main(String args[]){
        Child child1 = new Child();
        System.out.println(child1.getX());
        Child child2 = new Child(108);
        System.out.println(child2.getX());
        // final values can be changed only on initialization
    }
}