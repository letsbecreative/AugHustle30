package Sliding_Window;

public class S8_CheckForSubsequence {
    static boolean isSubsequence(String A, String B) {
        int i=0, j=0;
        while(i<A.length() && j<B.length()) {
            if(A.charAt(i) == B.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if(i == A.length()) return true;

        return false;
    }

    public static void main(String[] args) {
        String a = "gksrek";
        String b = "geeksforgeeks";
        System.out.println(isSubsequence(a, b));
    }
}
