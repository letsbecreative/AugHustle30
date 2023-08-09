class Solution {
    long maxProduct(int[] arr, int n) {
        // code here
        long maxp = Integer.MIN_VALUE, prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
            maxp = Math.max(maxp, prod);
            if (prod == 0) {
                prod = 1;
            }
        }

        prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            prod *= arr[i];
            maxp = Math.max(maxp, prod);
            if (prod == 0) {
                prod = 1;
            }
        }

        return maxp;
    }
}
