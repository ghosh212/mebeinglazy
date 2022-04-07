package com.tidbits.mebeinglazy.menu.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

    public static void main(String[] args) {
        String word ="";
        char cArray[] = word.toCharArray();
        HashMap<Character,Integer> cMap = new HashMap<>();
        for (int i =0;i<=word.length();i++){
            char c = word.charAt(i);
            if (cMap.containsKey(c)){
                cMap.put(c,cMap.get(c)+1);
            }else{
                cMap.put(c,1);
            }
        }

        Set<Map.Entry<Character,Integer>> cMaps = cMap.entrySet();
        for (Map.Entry<Character,Integer> entry : cMaps){
            if (entry.getValue() >1){
                //print the value and occurences
            }
        }

    }
}
