package ArraysHashing;

import java.util.*;

public class TopKFrequent347 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        int[] result = new int[k];
        
        for(int i = 0; i < k; i++){
            int maxFreq = 0;
            int maxNum = 0;
            
            for(int num: list){
                if(map.get(num)>maxFreq){
                    maxFreq = map.get(num);
                    maxNum = num;
                }
            }
            result[i]=maxNum;
            list.remove(Integer.valueOf(maxNum));
        }
        
        return result;
    }
}
