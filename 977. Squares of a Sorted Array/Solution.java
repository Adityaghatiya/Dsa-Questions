import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }
}
//Another approach
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.power(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
