import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums) {
            map.put(i, (int)map.getOrDefault(i, 0) + 1);
        }

        int n = nums.length / 3;

        for(int key : map.keySet()) {
            if(map.get(key) > n) list.add(key);
        }        

        return list;
    }
}