class Solution {
    public boolean rotateString(String s, String goal) {
        String str=goal+goal;
        if(s.length()!=goal.length())
            return false;
        return (str.contains(s));
    }
}
