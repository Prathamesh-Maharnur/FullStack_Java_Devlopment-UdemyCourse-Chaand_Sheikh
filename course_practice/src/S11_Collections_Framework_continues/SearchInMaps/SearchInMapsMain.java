package S11_Collections_Framework_continues.SearchInMaps;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo){
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo(){
        return sectionNo;
    }

    public String getLectureNo(){
        return lectureNo;
    }

    @Override
    public int compareTo(Code obj){
        String obj1 = sectionNo.concat(lectureNo);
        String obj2 = obj.getSectionNo().concat(obj.getLectureNo());
        return obj1.compareTo(obj2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Code code = (Code) o;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }

    public String toString(){
        return "Code{"+
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }
}
class SearchInMapsMain{
    public static void main(String[] args){
        Map<Code,String> map = new TreeMap<>();
        map.put(new Code("S11","11"),"Prathamesh");
        map.put(new Code("S11","22"),"Mayur");
        map.put(new Code("S11","00"),"Vinayak");
        map.put(new Code("S11","05"),"Vivek");
        map.put(new Code("S1","10"),"Chinmay");
        map.put(new Code("S11","10"),"Jitendra");

        System.out.println("Value of Code(\"S11\",\"00\"): "+map.get(new Code("S11","00")));

        Code code = null;
        for(Code key: map.keySet()){
            if(map.get(key).equals("Vivek")){
                code = key;
                break;
            }
        }
        System.out.println("key of \"Vivek\": "+code);
    }
}