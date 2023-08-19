class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int maximum = arr[0];
        long ans=0;
        for(int i=1;i<n;i++){
            if(arr[i] < maximum){
                ans += maximum-arr[i];
            }else{
                maximum = arr[i];
            }
        }
        int j = n-1;
        long maxi = arr[j];
        while(arr[j] < maximum){
            ans -= maximum - Math.max(arr[j], maxi);
            maxi = Math.max(arr[j],maxi);
            j--;
        }
        return ans;
    } 
}


