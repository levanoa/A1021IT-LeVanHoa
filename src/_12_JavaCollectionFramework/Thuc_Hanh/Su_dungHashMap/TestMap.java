package _12_JavaCollectionFramework.Thuc_Hanh.Su_dungHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("lehoa",26);
        hashMap.put("aaa",20);
        hashMap.put("xxx",54);
        System.out.println("hiển thị danh sách hashMap");
        System.out.println(hashMap + "\n");


        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("hiển thị danh sách hashMap");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(15,0.75f,true);
        linkedHashMap.put("lehoa",26);
        linkedHashMap.put("aaa",20);
        linkedHashMap.put("xxx",54);
        System.out.println("\nThe age for " + "lehoa is " + linkedHashMap.get("lehoa"));
    }
}
