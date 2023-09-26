package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<>();
        for (Map.Entry<Integer, String> integerStringEntry : sourceMap.entrySet()) {
            Integer key = integerStringEntry.getKey();
            String value = integerStringEntry.getValue();
            if(swappedMap.containsKey(value)){
                swappedMap.compute(value, (s, integer) -> swappedMap.get(value) > key ? key : swappedMap.get(value));
            }
            swappedMap.putIfAbsent(value, key);
        }
        return swappedMap;
    }
}
