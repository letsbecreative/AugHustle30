class Solution {
    public long countPairs(int[] nums, int k) {
        long result = 0;
        HashMap<Integer, Integer> gcdMap = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            int gcd = findGcd(nums[i], k);

            for(int num : gcdMap.keySet()) {
                if((long) gcd * num % k == 0) {
                    result += gcdMap.get(num);
                }
            }

            gcdMap.put(gcd, gcdMap.getOrDefault(gcd, 0) + 1);
        }
        return result;
    }
    
     public int findGcd(int x,int y)
        {
            while(x%y!=0){
                int rem=x%y;
                x=y;
                y=rem;
            }
            return y;
        }
}
