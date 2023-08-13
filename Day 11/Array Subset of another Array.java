class Compute {
    public String isSubset(long arr1[], long arr2[], long m, long n) {
        HashMap<Long, Long> frequency = new HashMap<>();

        for (int i = 0; i < m; i++) {
            frequency.put(arr1[i], frequency.getOrDefault(arr1[i], 0L) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (frequency.getOrDefault(arr2[i], 0L) > 0) {
                frequency.put(arr2[i], frequency.get(arr2[i]) - 1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
