class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
             long temp = arr[i];
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = -1;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(temp);
        }
        return arr;
    } 
}
