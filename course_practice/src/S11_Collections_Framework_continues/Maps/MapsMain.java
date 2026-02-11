package S11_Collections_Framework_continues.Maps;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


class MapsMain{
    public static void main(String[] main){
        Map<String,String> map1 = new HashMap<>();
        map1.put("a1","Prathamesh");
        map1.put("a2","Mayur");
        map1.put("a3","Vinayak");
        map1.put("a4","Chinmay");
        map1.put("a5",null);
        System.out.println(map1);
        System.out.println("*************************************************");

        Map<String,String> map2 = new LinkedHashMap<>();
        map2.put("a1","Prathamesh");
        map2.put("a2","Mayur");
        map2.put("a3","Vinayak");
        map2.put("a4","Chinmay");
        System.out.println(map2);
        System.out.println("*************************************************");

        Map<String,String> map3 = new TreeMap<>();
        map3.put("a1","Prathamesh");
        map3.put("a1","Mayur");
        map3.put("a3","Vinayak");
        map3.put("a4","Chinmay");
        map3.put("a5",null);
        System.out.println(map3);
        System.out.println("*************************************************");
    }
}