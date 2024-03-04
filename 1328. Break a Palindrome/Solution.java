class Solution {
    public String breakPalindrome(String palindrome) {
          char[] arr = palindrome.toCharArray();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (arr[i] != 'a' && palindrome.length() > 1) {
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        arr[palindrome.length() - 1] = 'b';
        return palindrome.length() < 2 ? "" : String.valueOf(arr);
    }
}
