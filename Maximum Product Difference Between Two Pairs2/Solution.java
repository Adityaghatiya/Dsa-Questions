class Solution {
    public int maxProductDifference(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;

        int smallest=Integer.MAX_VALUE;
        int secsmallest=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if (nums[i] > largest) {
                slargest = largest; 
                largest = nums[i];
            } else if (nums[i] > slargest) {
                slargest = nums[i];
            }

            if (nums[i] < smallest) {
                secsmallest = smallest; 
                smallest = nums[i];
            } else if (nums[i] < secsmallest) {
                secsmallest = nums[i];
            }
        }
        int number=(largest*slargest)-(smallest*secsmallest);
        return number;
    }
}
