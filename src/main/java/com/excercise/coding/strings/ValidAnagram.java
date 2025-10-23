package com.excercise.coding.strings;

import java.util.HashMap;

public class ValidAnagram {

    /*
     * Best Solution 
     * TC: O(n)
     * SC: O(1)
     */
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26]; //The 26 alphabet letters in English

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }



    public boolean isAnagramWithHashMap(String s, String t) {
        HashMap<String, Integer> mapS = new HashMap<>();
        HashMap<String, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (mapS.containsKey(s.charAt(i) + "")) {
                mapS.put(s.charAt(i) + "", mapS.get(s.charAt(i) + "") + 1);
            } else {
                mapS.put(s.charAt(i) + "", 1);
            }

            if (mapT.containsKey(t.charAt(i) + "")) {
                mapT.put(t.charAt(i) + "", mapT.get(t.charAt(i) + "") + 1);
            } else {
                mapT.put(t.charAt(i) + "", 1);
            }

        }
        return mapS.equals(mapT);
    }
}
