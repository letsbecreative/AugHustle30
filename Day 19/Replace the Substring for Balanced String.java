class Solution {
    public int balancedString(String s) {
        int n = s.length();
        if(n % 4 != 0) return -1;
        int need = n / 4;
        int left = 0, right = 0;
        int[] count = new int[128];
        int res = n;
        for (char c: s.toCharArray()) count[c]++;

        while(right < n){
            count[s.charAt(right)]--;
            right++;
            while (left < n && count['Q'] <= need && count['W'] <= need && count['E'] <= need && count['R'] <= need){
                res = Math.min(res, right - left);
                count[s.charAt(left)]++;
                left++;
            }
        }
        return res;
    }
}
