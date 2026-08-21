package Neetcode;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(ValidAnagramSolution.isAnagram("anagram", "nagaram")); // true
        System.out.println(ValidAnagramSolution.isAnagram("rat", "car")); // false
        System.out.println(ValidAnagramSolution.isAnagram("aacc", "ccac")); // false
        System.out.println(ValidAnagramSolution.isAnagram("a", "ab")); // false
        System.out.println(ValidAnagramSolution.isAnagram("a", "a")); // true
        System.out.println(ValidAnagramSolution.isAnagram("", "")); // true
    }
}

class ValidAnagramSolution {
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++){
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 0);
            map.computeIfPresent(s.charAt(i), (k,v) -> v+1);
            if (!map2.containsKey(t.charAt(i))) map2.put(t.charAt(i), 0);
            map2.computeIfPresent(t.charAt(i), (k,v) -> v+1);
        }
        if (map.equals(map2)) return true;
        return false;
    }
}
