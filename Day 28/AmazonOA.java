package Sliding_Window;

import java.util.HashMap;

public class S7_AmazonOA {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int[] arr= {1,2,7,7,4,3,6};
            int n = arr.length;
            int k = 3;

            HashMap<Integer,Integer> hm = new HashMap<>();

            int currsum=0;
            int i=0, j=0;

            int ans= Integer.MIN_VALUE;

            while(j < n) {
                currsum+=arr[j];
                hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);

                if(j-i+1 < k) {
                    j++;
                }

                else if(j-i+1 == k) {

                    if(hm.size() == k) {
                        ans=Math.max(currsum,ans);
                    }

                    currsum-=arr[i];
                    hm.put(arr[i],hm.get(arr[i])-1);
                    if(hm.get(arr[i])==0) hm.remove(arr[i]);
                    i++;
                    j++;

                }
            }
            System.out.print(ans);
        }
    }
