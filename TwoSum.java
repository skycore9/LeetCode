public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        
        int [] result = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            if (m.containsKey(target - nums[i])) {
            	result[0] = m.get(target - nums[i]);
            	result[1] = i;
            	break;
            } else {
            	m.put(nums[i], i);
            }
        }
        
        return result;
    }
}