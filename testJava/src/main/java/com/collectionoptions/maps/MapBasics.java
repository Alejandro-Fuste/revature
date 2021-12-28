package com.collectionoptions.maps;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "this is my first value");
        myMap.put(2, "this is my second value");
        myMap.put(3, "this is my third value");
        System.out.println(myMap);
        System.out.println(myMap.get(1));
        System.out.println(myMap.getOrDefault(4, "this key does not exists"));
        System.out.println(myMap);
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        myMap.replace(2, "this is the new value");
        System.out.println(myMap);

    }
}
