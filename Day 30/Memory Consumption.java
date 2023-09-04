package Sliding_Window;

public class S2_MemoryConsumption {
    static int memoryConsump(int[] arr, int n, int k) {
        int i=0, j=0;
        int currSum=0, maxSum=0;
        int totalSum=0;

        for(int x=0; x<n; x++) {
            totalSum += arr[x];
        }

        while(j < n) {
            currSum += arr[j];

            if(j-i+1 < k) {
                j++;
            } else if(j-i+1 == k) {
                maxSum = Math.max(maxSum, currSum);

                currSum -= arr[i];
                i++;
                j++;
            }
        }
        return (totalSum - maxSum);
    }

    public static void main(String[] args) {
        int[] processes = {10,4,8,13,20};
        int n = processes.length;
        int m = 2;
        System.out.println(memoryConsump(processes, n, m));
    }
}
