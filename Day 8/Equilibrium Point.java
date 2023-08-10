class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {

        long sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        long leftsum=0;
        for(int i=0;i<n;i++){
            if(leftsum==sum-a[i]){
                return i+1;
            }
            leftsum+=a[i];
            sum-=a[i];
        }
        return -1;
    }
}
