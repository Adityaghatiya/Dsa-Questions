class Solution {
    public int heightChecker(int[] height) {
        int arr[] = new int[101];
        Arrays.fill(arr, 0);

        // Count each height in the input array
        for (int i = 0; i < height.length; i++) {
            arr[height[i]]++;
        }

        int idx = 0;
        int ans = 0;
        
        // Traverse the original array and compare it with the sorted order
        for (int i = 0; i < height.length; i++) {
            // Find the next height in sorted order
            while (arr[idx] == 0) {
                idx++;
            }

            // If the current height does not match the expected height in sorted order
            if (height[i] != idx) {
                ans++;
            }
            // Decrease the count of the height
            arr[idx]--;
        }
        return ans;
    }
}
