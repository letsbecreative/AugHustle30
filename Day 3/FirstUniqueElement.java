class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(hmap.containsKey(a[i])) {
                hmap.put(a[i], hmap.getOrDefault(a[i], 0) + 1);
            } else {
                hmap.put(a[i], 1);
            }
        }
        for(int i = 0; i < n; i++) {
            if(hmap.get(a[i]) % k != 0) return a[i];
        }
        return -1;
    }
}
