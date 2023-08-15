class Solution
{
    
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       Arrays.sort(A);
       
       for(int i=0; i<n-1; i++) {
           int l = i+1;
           int r = n-1;
           int x =  A[i];
           
           while(l < r) {
               if(x + A[l] + A[r] == X) {
                   l++;
                   r--;
                   return true;
               } else if(x + A[l] + A[r] < X) {
                   l++;
               } else {
                   r--;
               }
           }
       }
       
        return false;
    }
}
