import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 입력을 받기 위한 준비
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 설탕의 양을 입력 받음
        int sugar = sc.nextInt();

        // 설탕 배달 횟수를 저장하는 변수 초기화
        int count = 0;

        // 5로 나누어 떨어지는 경우를 먼저 처리
        if (sugar % 5 == 0) {
            System.out.println(sugar / 5);
            return;
        }

        // 5로 나누어 떨어지지 않는 경우, 3킬로그램 봉지로 최대한 많이 채우기
        while (sugar > 0) {
            sugar -= 3;
            count++;

            // 남은 설탕이 5의 배수가 되면 출력하고 종료
            if (sugar % 5 == 0) {
                count += sugar / 5;
                System.out.println(count);
                return;
            }
        }

        // 반복문을 빠져나왔을 때 설탕이 0이 아닌 양이면 3과 5의 조합으로 나눌 수 없는 경우
        System.out.println(-1);
    }
}
