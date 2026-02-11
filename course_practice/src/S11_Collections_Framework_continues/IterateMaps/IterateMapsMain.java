package S11_Collections_Framework_continues.IterateMaps;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class IterateMapsMain{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("a1","Prathamesh");
        map.put("a2","Mayur");
        map.put("a3","Vinayak");
        map.put("a4","Chinmay");

        //Method 1
        System.out.println("For Each loop:");
        for(String key: map.keySet()){
            System.out.println("key = "+key+", value = "+map.get(key));
        }
        System.out.println("**********************************************");

        //Method 2
        System.out.println("Entry<K,V> and entrySet():");
        for(Map.Entry<String,String> mapElement: map.entrySet()){
            System.out.println("key = "+mapElement.getKey()+", value = "+mapElement.getValue());
        }
        System.out.println("**********************************************");

        //Method 3
        System.out.println("Iterator using Entry<K,V>:");
        Iterator<Map.Entry<String,String>> mapIterator =  map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String,String> temp = mapIterator.next();
            System.out.println("key = "+temp.getKey()+", value = "+temp.getValue());
        }
    }
}