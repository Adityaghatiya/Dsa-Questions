class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == letter) {
                count++;
            }
        }
        
        // Ensure non-zero denominator to avoid division by zero
        if (s.length() == 0) {
            return 0;
        }

        int result = Math.abs((count * 100) / s.length());
        return result;
    }
}
