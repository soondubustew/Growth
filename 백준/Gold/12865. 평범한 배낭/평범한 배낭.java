import java.util.Scanner;

public class Main {
    public static int getMaxValue(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(values[i - 1] + dp[i - 1][j - weights[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        
        int[] weights = new int[n];
        int[] values = new int[n];
        
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        
        int maxValue = getMaxValue(weights, values, capacity);
        System.out.println(maxValue);
    }
}
