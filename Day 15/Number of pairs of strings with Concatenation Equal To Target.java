class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++) {
            char ch1 = nums.charAt[i];
            for(int j=0; j<nums.length(); j++) {
                char ch2 = nums.charAt[j];
                if((ch1 + ch2) == target) count++;
            }
        }
        return count;
    }
}
