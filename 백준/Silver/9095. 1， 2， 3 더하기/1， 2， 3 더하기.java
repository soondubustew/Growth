import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt(); // 테스트 케이스의 개수를 입력

        int dp[] = new int[11]; // dp 배열을 선언 dp[i]는 i를 1, 2, 3의 합으로 나타내는 방법의 수를 저장

        // 초기 조건 설정
        dp[1] = 1; // 1을 1로 표현하는 방법은 한 가지
        dp[2] = 2; // 2를 1+1 또는 2로 표현하는 방법은 두 가지
        dp[3] = 4; // 3을 1+1+1, 1+2, 2+1, 3으로 표현하는 방법은 네 가지

        // Bottom-up 방식으로 dp 배열
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1]; // dp[i]는 dp[i-3], dp[i-2], dp[i-1]의 값을 이용하여 계산됩니다.
        }

        // 각 테스트 케이스에 대해 결과를 출력.
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 테스트 케이스의 값을 입력
            
            sb.append(dp[n]).append("\n"); // 결과를 StringBuilder에 저장
        }
        System.out.println(sb); // 결과를 출력
        
    }
}
