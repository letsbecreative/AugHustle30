class Solution {
    public int[] longestCommonPrefix(String s1, String s2){
        int arr[] = new int[2];
       arr[0] = 0;
       int maxind = 0;
       for(int i = 0; i <= s1.length() - 1; i++){
            if(s2.contains(s1.substring(0 , i + 1))){
                maxind = i;
           }
       }
       arr[1] = maxind;  
       return arr;
    }
}
