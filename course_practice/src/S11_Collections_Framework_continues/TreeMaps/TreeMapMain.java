package S11_Collections_Framework_continues.TreeMaps;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo,String lectureNo){
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public int compareTo(Code obj){
        return 0;
    }

    public String toString(){
        return "Code{"+
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo=" + lectureNo + '\'' +
                '}';
    }
}

class TreeMapMain{
    public static void main(String[] args){
        Map<Code ,String> map = new HashMap<>();
        map.put(new Code("S11", "10"), "Prathamesh");
        map.put(new Code("S11", "10"), "Mayur");
        map.put(new Code("S11", "10"), "Vinayak");
        map.put(new Code("S11", "10"), "Chinmay");
        map.put(new Code("S11", "10"), "Vivek");
        map.put(new Code("S11", "10"), "Jitendra");

        System.out.println("HashMap:");
        for(Map.Entry<Code,String> mapElement: map.entrySet()){
            System.out.println("key = "+mapElement.getKey()+", value = "+mapElement.getValue());
        }
        System.out.println("******************************************************************");


        Map<Code ,String> map2 = new TreeMap<>();
        map2.put(new Code("S11", "10"), "Prathamesh");
        map2.put(new Code("S11", "10"), "Mayur");
        map2.put(new Code("S11", "10"), "Vinayak");
        map2.put(new Code("S11", "10"), "Chinmay");
        map2.put(new Code("S11", "1"), "Vivek");
        map2.put(new Code("S11", "10"), "Jitendra");

        System.out.println("TreeMap:");
        for(Map.Entry<Code,String> mapElement: map2.entrySet()){
            System.out.println("key = "+mapElement.getKey()+", value = "+mapElement.getValue());
        }
        System.out.println("******************************************************************");
    }
}