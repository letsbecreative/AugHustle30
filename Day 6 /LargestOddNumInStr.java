class Solution {

    String maxOdd(String num) {
        // code here
         int n  = num.length();
        for(int i= n-1; i>=0; i--){
            if(num.charAt(i)%2!=0) return num.substring(0, i+1);
        }
        return "";
    }
}
