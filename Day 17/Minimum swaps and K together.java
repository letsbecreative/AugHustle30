class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count=0;
        for(int i=0 ; i<n ; i++)
            if(arr[i]<=k)
                count++; 
        
        int swap=0;
        
        for( int i= 0 ; i< count ; i++)
        if(arr[i]>k)
        swap++;
        
        // we get the size of subarray
        
        int i=0, j = count;
        int mi= swap;
        
        while(j<n)
        {
            if(arr[i]>k)
            swap--;
            if(arr[j]>k)
            swap++;
            
            mi= Math.min( mi , swap);
            
            i++;
            j++;
        }
        return mi;
    }
    
    
}
