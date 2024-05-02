import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 n을 입력 받음
        int n = sc.nextInt();

        // 피보나치 수열의 첫 번째 숫자와 두 번째 숫자 초기화
        long sum = 1; // n번째 피보나치 수를 저장할 변수
        long f1 = 0;  // 첫 번째 피보나치 수
        long f2 = 1;  // 두 번째 피보나치 수

        // 반복문을 통해 피보나치 수열 계산
        for (int i = 1; i < n; i++) {
            sum = f1 + f2; // 다음 피보나치 수 계산
            f1 = f2;       // 다음 반복에서 이전 피보나치 수를 현재 피보나치 수로 업데이트
            f2 = sum;      // 다음 반복에서 현재 피보나치 수를 다음 피보나치 수로 업데이트
        }

        // n번째 피보나치 수 출력
        System.out.println(sum);
    }
}
