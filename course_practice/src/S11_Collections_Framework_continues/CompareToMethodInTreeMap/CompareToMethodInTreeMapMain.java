package S11_Collections_Framework_continues.CompareToMethodInTreeMap;

import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo,String lectureNo){
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
        String object1 = sectionNo.concat(lectureNo);
        String object2 = obj.getSectionNo().concat(obj.getLectureNo());
        return object1.compareTo(object2);
    }

    public String toString(){
        return "Code{"+
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo=" + lectureNo + '\'' +
                '}';
    }
}

class CompareToMethodInTreeMapMain{
    public static void main(String[] args){
        Map<Code,String> map = new TreeMap<>();
        map.put(new Code("S11", "10"), "Prathamesh");
        map.put(new Code("S11", "10"), "Mayur");
        map.put(new Code("S11", "10"), "Vinayak");
        map.put(new Code("S11", "10"), "Chinmay");
        map.put(new Code("S11", "1"), "Vivek");
        map.put(new Code("S11", "10"), "Jitendra");

        for(Map.Entry<Code,String> mapElement: map.entrySet()){
            System.out.println("key = "+mapElement.getKey()+", value = "+mapElement.getValue());
        }
    }
}