class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String s1=arr[0];
        String s2=arr[arr.length-1];
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
            else{
                break;
            }
            
        }
        return i==0?"":s1.substring(0,i);
    }
}
