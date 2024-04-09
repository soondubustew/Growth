import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt(); // 테스트 케이스의 개수 입력
        for (int i = 0; i < num; i++) { // 테스트 케이스의 개수만큼 반복
            int a = sc.nextInt(); // 밑이 되는 수 입력
            int b = sc.nextInt(); // 거듭제곱할 지수 입력
            int result = 1; // 결과를 저장할 변수 초기화
            for (int j = 0; j < b; j++) { // 거듭제곱 연산을 위한 반복문
                result *= a; // 밑의 수를 지수만큼 곱하여 결과에 저장
                result %= 10; // 결과를 10으로 나눈 나머지를 취함 (마지막 자리 숫자만 남기기 위함)
            }
            if (result == 0) result = 10; // 결과가 0이면 10으로 변경
            sb.append(result).append("\n"); // 현재 테스트 케이스의 결과를 StringBuilder에 추가
        }
        System.out.println(sb); // 모든 테스트 케이스의 결과 출력
    }
}
