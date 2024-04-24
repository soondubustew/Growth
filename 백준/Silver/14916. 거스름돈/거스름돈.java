import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 거스름돈의 개수를 저장할 변수 count 초기화
        int count = 0;
        
        // 사용자로부터 거스름돈의 금액 입력 받기
        int money = sc.nextInt();
        
        

        // 입력된 금액이 양수인 경우, 5원짜리와 2원짜리 동전을 사용하여 거스름돈을 계산
        while (money > 0) {
            // 남은 돈이 5원짜리 동전으로 나누어 떨어지는 경우
            if (money % 5 == 0) {
                count = money / 5 + count; // 5원짜리 동전으로 거슬러주고 남은 동전의 개수를 count에 더함
                break; // 거스름돈 계산 완료
            }
            // 5원짜리 동전으로 거슬러주기 어려운 경우 2원짜리 동전 사용
            money -= 2; // 2원짜리 동전으로 거슬러주고 남은 돈을 업데이트
            count++; // 사용한 동전의 개수를 증가
        }
        
        // 거스름돈의 개수 출력
        if (money < 0) {
            System.out.println(-1); // 거스름돈을 주는데 실패한 경우
        } else {
            System.out.println(count);
        }
    }
}
