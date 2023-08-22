class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int l=0, r=nums.length-1;
        while(l<r) {
            int sum = nums[l] + nums[r];
            if(sum == target) {
                res[0] = l+1;
                res[1] = r+1;
                break;
            } else if(sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
