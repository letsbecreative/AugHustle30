static pair getMinMax(long a[], long n)  
    {
        long smallest = a[0];
        long biggest = a[0];

        for(int i = 0; i<n; i++)
        {
            if(a[i] > biggest)
                biggest = a[i];
            else if(a[i] < smallest)
                smallest = a[i];
        }
         
        return (new pair(smallest,biggest));
    }
