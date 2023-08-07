class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
         
        LinkedHashMap<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
    
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            if (frequencyMap.get(num) == 2) {
               result.add(num);
            }
        }
    
        if(result.isEmpty()) {
            result.add(-1);
            return result;
        }
        
        Collections.sort(result);
    
        return result;
    }
}
