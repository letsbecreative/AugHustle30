class Solution {
    public String reverseWords(String s) {
        String[] splitted=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");

        for(int i=splitted.length-1;i>=0;i--)
        {
            String temp=splitted[i];
            sb.append(temp);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
