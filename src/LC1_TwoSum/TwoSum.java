package LC1_TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for(int i =0 ; i < nums.length ; i++) {
            int comp = target - nums[i];
            if(res.containsKey(comp)){
                return new int[]{i, res.get(comp)};
            } else res.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
