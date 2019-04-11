package lec13dp;

public class DigitalTriangle {
    public static void main(String[] args) {
        int a[][] = {
                {7, 0, 0, 0, 0},
                {3, 8, 0, 0, 0},
                {8, 1, 0, 0, 0},
                {2, 7, 4, 4, 0},
                {4, 5, 2, 6, 5}
        };
        int n = a.length;
        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++)
            dp[n - 1][j] = a[n - 1][j];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = a[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        System.out.println(dp[0][0]);
    }
}
