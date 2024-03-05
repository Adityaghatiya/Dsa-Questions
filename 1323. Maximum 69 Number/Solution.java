class Solution {
    public int maximum69Number (int nums) {
         String num = Integer.toString(nums);
        char[] ch = num.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        return nums;
    }
}
