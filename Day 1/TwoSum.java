class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i=0; i<n; i++) {
            int sum = target - nums[i];
            if(hmap.containsKey(sum)) {
                ans[0] = hmap.get(sum);
                ans[1] = i;
                return ans;
            }
            hmap.put(nums[i], i);
        }
        return ans;
    }
}
