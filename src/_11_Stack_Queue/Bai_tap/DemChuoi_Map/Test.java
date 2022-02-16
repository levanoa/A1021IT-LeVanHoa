package _11_Stack_Queue.Bai_tap.DemChuoi_Map;

import java.security.Key;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        String chuoi = "LE VAN HOA LE VAN HOA";
        chuoi = chuoi.replaceAll(",","");
        String[] arr = chuoi.split(" ");
        String key = "";
        Integer value;
        Map<String,Integer> map = new TreeMap<String,Integer>();
        for( int i = 0; i< arr.length; i ++){
            key = arr[i];
            if(map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value +1);
            } else {
                map.put(key,1);
            }
        }
        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            key = (String)i.next();
            System.out.println("từ " + key + " xuất hiện " + map.get(key) + " lần");
        }
    }



}
