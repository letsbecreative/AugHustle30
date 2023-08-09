class Solution
{
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int currSum = 0, start = 0, end = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (end < n)
        {
            currSum += arr[end];
            
            // Remove elements from the start of the subarray until currSum becomes <= s.
            while (currSum > s && start <= end)
            {
                currSum -= arr[start];
                start++;
            }
            
            if (currSum == s && start <= end)
            {
                ans.add(start + 1); // Adding 1 to convert 0-based index to 1-based index
                ans.add(end + 1);
                return ans;
            }
            
            end++;
        }
        
        ans.add(-1); // If no such subarray is found
        return ans;
    }
}
