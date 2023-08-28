

//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        //int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = a.length;
        for(int i=0; i<n; i++)
        {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else {
                map.put(a[i], 1);
            }
        }
        for(int key : map.keySet())
        {
            if(map.get(key) > n/2) {
                return key;
            }
            
        }
        return -1;
    }
}
