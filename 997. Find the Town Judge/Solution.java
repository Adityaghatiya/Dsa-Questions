class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> trustCount = new HashMap<>();
        Map<Integer, Integer> trustedCount = new HashMap<>();
        
        // Iterate through the trust array
        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trustCount.put(a, trustCount.getOrDefault(a, 0) + 1); // Increment trust count
            trustedCount.put(b, trustedCount.getOrDefault(b, 0) + 1); // Increment trusted count
        }
        
        // Iterate through the trusted count map to find the judge
        for (Map.Entry<Integer, Integer> entry : trustedCount.entrySet()) {
            int person = entry.getKey();
            int count = entry.getValue();
            if (count == n - 1 && !trustCount.containsKey(person)) {
                return person; // Found the judge
            }
        }
        
        return -1; // No judge found
    }
}
