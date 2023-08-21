class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
       ArrayList<Integer> ans = new ArrayList<>();

        int l = 0, r = m - 1;
        int diff = Integer.MAX_VALUE;

        while (l < n && r >= 0) {
            int sum = arr[l] + brr[r];
            if (Math.abs(sum - x) < diff) {
                diff = Math.abs(sum - x);
                ans.clear();
                ans.add(arr[l]);
                ans.add(brr[r]);
            }

            if (sum < x) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
