class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = arr.length;
        int r = mat.length;
        int c = mat[0].length;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                map.put(mat[i][j], new ArrayList<>(Arrays.asList(i, j)));
            }
        }

        System.out.println(map);

        int[] row = new int[r];
        int[] col = new int[c];

        int rowVal = Integer.MAX_VALUE;
        int colVal = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int val = arr[i];
            int rw = map.get(val).get(0);
            int cw = map.get(val).get(1);

            row[rw]++;
            if (row[rw] == c) {
                colVal = Math.min(colVal, i);
            }
            col[cw]++;
            if (col[cw] == r) {
                rowVal = Math.min(rowVal, i);
            }
        }
        return Math.min(rowVal, colVal);
    }
}
