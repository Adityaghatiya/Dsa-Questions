class Solution {
    public double averageWaitingTime(int[][] customers) {
        int count = customers[0][0];
        long result = 0;
        for (int i = 0; i < customers.length; i++) {
            if (count >= customers[i][0]) {
                count += customers[i][1];
                result += count - customers[i][0];
            } else {
                count = customers[i][0] + customers[i][1];
                result += count - customers[i][0];
            }
        }

        double avg = (double) result / customers.length;

        return avg;
    }
}
