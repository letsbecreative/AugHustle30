class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        return plaindromeRec(0,str);
    }
    static boolean plaindromeRec(int i,String str) {
        if(i>=str.length()/2)
            return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1))
            return false;
        return plaindromeRec(i+1,str);
    }
}
