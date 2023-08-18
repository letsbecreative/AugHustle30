class Solution
{
    public int firstElementKTime(int[] arr, int n, int k) { 
        int ans = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
            if(hmap.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
       
    } 
}
