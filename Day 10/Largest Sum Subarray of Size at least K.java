class Compute {
    
    public long maxSumWithK(long a[], long N, long K)
    {
        int n = (int)N;
        int k = (int)K;
        
        long sum = 0;
        
        for(int i=0; i<k; i++)
        {
            sum += a[i];
        }
        
        long ans = sum;
        
        long prev = 0;
        
        long prev_sum = 0;
        
        for(int i=k; i<n; i++)
        {
            prev_sum += a[i-k];
            
            prev = Math.min(prev, prev_sum);
            
            sum += a[i];
            
            if(sum-prev>ans)
            {
                ans = sum-prev;
            }
        }
        
        return ans;
    }
}
