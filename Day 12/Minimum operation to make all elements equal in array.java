import java.util.*;
import java.lang.*;
public class SetA_P4_MinOprEqualArr {
    public static int minOperations(int[] arr, int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(hmap.containsKey(arr[i])) {
                hmap.put(arr[i], hmap.get(arr[i])+1);
            } else {
                hmap.put(arr[i], 1);
            }
        }

        int max = 0;
        Set<Integer> set = hmap.keySet();
        for(int i : set) {
            if(max < hmap.get(i)) {
                max = hmap.get(i);
            }
        }

        return (n - max);

    }

    public static void main (String[] args) throws java.lang.Exception {
        int[] arr = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;
        System.out.println(minOperations(arr, n));
    }
}
