package S7_Core_concepts.FinalKeywordWithDataMembers;

/*
    Since the File name is 'Child_FinalDataMember.java' and the
    class it contains is Child (without public access specifier);
    the file will still compile and execute but the class file name
    will be Child.java
*/
class Child{
    public final int x;

    public Child(){
        this.x = 10;
    }

    public Child(int x){
       this.x = x;
    }

    public int getX(){
        return x;
    }
}