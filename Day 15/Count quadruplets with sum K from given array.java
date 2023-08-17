class Solution{
static int countSum(int a[], int n, int sum)
{
    int i, j, k, l;
    int count = 0;
    for(i = 0; i < n - 3; i++)
    {
        for(j = i + 1; j < n - 2; j++)
        {
            int req = sum - a[i] - a[j];
            HashMap<Integer, Integer> m = new HashMap<>();
            for(k = j + 1; k < n; k++)
                if (m.containsKey(a[k]))
                {
                    m.put(a[k], m.get(a[k]) + 1);
                }
                else
                {
                    m.put(a[k], 1);
                }
                 
            int twice_count = 0;
            for(k = j + 1; k < n; k++)
            {
                if (m.containsKey(req - a[k]))
                    twice_count += m.get(req - a[k]);
 
                if (req - a[k] == a[k])
                    twice_count--;
            }
            count += twice_count / 2;
        }
    }
    return count;
}
