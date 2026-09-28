package ArraysHashing;

import java.util.Arrays;

public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("rat", "car"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    //Approach 2: Optimum

    static boolean isAnagram2(String s, String t) {
        int[] count = new int[26];
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int n : count){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
