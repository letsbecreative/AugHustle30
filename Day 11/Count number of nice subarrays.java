class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2 != 0)
                nums[i] = 1;
            else
                nums[i] = 0;
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, 1);
        int sum = 0, count = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            if(hmap.containsKey(sum - k)) {
                count += hmap.get(sum - k);
            }
            hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
