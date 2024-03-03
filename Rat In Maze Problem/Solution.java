class Solution {
        public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 0) {
            return ans;
        }

        StringBuilder path = new StringBuilder("");
        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], 0);
        }
        int srcx = 0;
        int srcy = 0;
        solve(m, n, ans, srcx, srcy, visited, path);

        return ans;
    }

    public static void solve(int[][] m, int n, ArrayList<String> ans, int x, int y, int[][] visited, StringBuilder path) {
        if (x == n - 1 && y == n - 1) {
            ans.add(path.toString());
            return;
        }
        visited[x][y] = 1;

        // down
        if (isSafe(x + 1, y, n, visited, m)) {
            path.append('D');
            solve(m, n, ans, x + 1, y, visited, path);
            path.setLength(path.length() - 1);
            visited[x + 1][y] = 0; // backtrack
        }

        // left
        if (isSafe(x, y - 1, n, visited, m)) {
            path.append('L');
            solve(m, n, ans, x, y - 1, visited, path);
            path.setLength(path.length() - 1);
            visited[x][y - 1] = 0; // backtrack
        }

        // right
        if (isSafe(x, y + 1, n, visited, m)) {
            path.append('R');
            solve(m, n, ans, x, y + 1, visited, path);
            path.setLength(path.length() - 1);
            visited[x][y + 1] = 0; // backtrack
        }

        // up
        if (isSafe(x - 1, y, n, visited, m)) {
            path.append('U');
            solve(m, n, ans, x - 1, y, visited, path);
            path.setLength(path.length() - 1);
            visited[x - 1][y] = 0; // backtrack
        }
    }

    public static boolean isSafe(int x, int y, int n, int[][] visited, int[][] m) {
        return (x >= 0 && x < n) && (y >= 0 && y < n) && visited[x][y] == 0 && m[x][y] == 1;
    }
}
