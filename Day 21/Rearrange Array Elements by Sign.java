class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Define array for storing the ans separately.
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (nums[i] < 0) {
                ans.set(negIndex, nums[i]);
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, nums[i]);
                posIndex += 2;
            }
        }

        // Convert ArrayList to array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
