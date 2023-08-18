
class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
         long[] res = new long[N-K+1];
        
        List<Long> list = new ArrayList<>();
        
        for(int i = 0; i < K; i++) {
            if(A[i] < 0) {
                list.add(A[i]);
            }
        }
        int x = 0;
        if(! list.isEmpty()) res[x++] = list.get(0);
        if(list.isEmpty()) res[x++] = 0;
        
        int j = K;
        int i = 0;
        while(j < N) {
            if(A[j] < 0) {
                list.add(A[j]);
            }
            
            if(! list.isEmpty() && A[i]  == list.get(0)) {
                list.remove(0);
            }
            
            if(list.isEmpty()) {
                res[x++] = 0;
            }
            else {
                res[x++] = list.get(0);
            }
            i++;
            j++;
        }
        
        return res;
        
    }
}
