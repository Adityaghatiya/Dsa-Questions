/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = getPeakelement(mountainArr);
        
        // If the target is found at the peak, return the peak index.
        if (mountainArr.get(peak) == target) {
            return peak;
        }
        
        // Search in the left side of the mountain.
        int left = getAgosticBinarySearch(mountainArr, 0, peak, target);
        
        if (left != -1) {
            return left;
        }
        
        // Search in the right side of the mountain, excluding the peak.
        int right = getAgosticBinarySearch(mountainArr, peak + 1, mountainArr.length() - 1, target);
        
        return right;
    }

    public int getAgosticBinarySearch(MountainArray mountainArr, int start, int end, int target) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) == target) {
                return mid;
            }
            
            if (isAsc) {
                if (mountainArr.get(mid) < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (mountainArr.get(mid) < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }

    public int getPeakelement(MountainArray mountainArr) {
        int ans = -1;
        int len = mountainArr.length();
        int low = 0;
        int high = len - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid;
            }
        }

        return ans;
    }
}
