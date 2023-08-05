class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map to handle subarrays starting from index 0.
        for (int i = 0; i < n; i++) {
            // Calculate the prefix sum up to index i:
            preSum += arr[i];

            // Calculate the value to be removed to get subarrays with sum k:
            int remove = preSum - k;

            // Add the number of subarrays with sum remove to the count:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of the current prefix sum in the map:
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
