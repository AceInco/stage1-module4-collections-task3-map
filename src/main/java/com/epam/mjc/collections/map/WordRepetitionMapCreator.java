package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("[,. ]");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            if(word.isEmpty()){
                continue;
            }
            word = word.toLowerCase();
            map.putIfAbsent(word, 0);
            map.compute(word, (s, integer) -> integer+1);
        }
        return map;
    }
}
