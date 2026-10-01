package ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
            else{
                map.get(key).add(s);
            }
        }
        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }
}
