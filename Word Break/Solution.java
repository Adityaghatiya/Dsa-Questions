class Solution
{
     public static int wordBreak(String A, ArrayList<String> B) {
        Set<String> set = new HashSet<>();

        // Populate the set with words from ArrayList B.
        for (String word : B) {
            set.add(word);
        }

        return dfs(A, set);
    }

    public static int dfs(String A, Set<String> set) {
        // Base case: If the string is empty, it means all words have been found.
        if (A.equals("")) {
            return 1;
        }

        for (int i = 1; i <= A.length(); i++) {
            if (set.contains(A.substring(0, i)) && dfs(A.substring(i), set) == 1) {
                return 1;
            }
        }
        return 0;
    }
}
