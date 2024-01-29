class Solution {
    public String countAndSay(int n) {
        String currentTerm = "1";

        for (int i = 2; i <= n; i++) {
            currentTerm = countAndAdd(currentTerm);
        }

        return currentTerm;
    }

    public String countAndAdd(String currentTerm) {
        StringBuilder result = new StringBuilder();

        char currentChar = currentTerm.charAt(0);
        int count = 1;

        for (int i = 1; i < currentTerm.length(); i++) {
            if (currentTerm.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                currentChar = currentTerm.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(currentChar);

        return result.toString();
    }
}
