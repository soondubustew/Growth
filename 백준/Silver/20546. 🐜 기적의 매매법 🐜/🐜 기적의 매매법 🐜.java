import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위해 Scanner 객체를 생성

    int money = sc.nextInt();  // 초기 자본 입력
    int joon_money = money;  // 준현이의 초기 자본
    int joon_count = 0;  // 준현이가 보유한 주식 수
    int min_money = money;  // 성민이의 초기 자본
    int min_count = 0;  // 성민이가 보유한 주식 수
    int arr[] = new int[14+1];  // 14일 동안의 주가 배열

    for (int i = 1; i < arr.length; i++) {
      arr[i] = sc.nextInt();  // 14일 동안의 주가 입력
    }

    // 준현이 로직: 매수할 수 있을 때마다 매수
    for (int i = 1; i < arr.length; i++) {
      if (joon_money >= arr[i]) {  // 매수 가능할 때
        joon_count += joon_money / arr[i];  // 매수 가능한 주식 수 계산
        joon_money %= arr[i];  // 남은 돈 계산
      }
    }

    // 성민이 로직: 3일 연속 하락 시 매수, 3일 연속 상승 시 매도
    for (int j = 1; j <= 11; j++) {  // 마지막 3일을 비교하기 위해 범위는 11까지
      if (arr[j] > arr[j+1] && arr[j+1] > arr[j+2]) {
        // 3일 연속 하락 시
        min_count += min_money / arr[j+3];  // 매수 가능한 주식 수 계산
        min_money %= arr[j+3];  // 남은 돈 계산
      } else if (arr[j] < arr[j+1] && arr[j+1] < arr[j+2]) {
        // 3일 연속 상승 시
        if (min_count > 0) {  // 보유한 주식이 있을 경우
          min_money += min_count * arr[j+3];  // 보유 주식을 모두 매도
          min_count = 0;  // 주식 수 초기화
        }
      }
    }

    int joon_total_money = joon_money + arr[14] * joon_count;  // 준현이의 최종 자산
    int min_total_money = min_money + arr[14] * min_count;  // 성민이의 최종 자산

    // 최종 자산 비교하여 결과 출력
    if (joon_total_money > min_total_money) {
      System.out.println("BNP");  // 준현이가 더 많은 자산을 가진 경우
    } else if (joon_total_money == min_total_money) {
      System.out.println("SAMESAME");  // 둘의 자산이 같은 경우
    } else {
      System.out.println("TIMING");  // 성민이가 더 많은 자산을 가진 경우
    }
  }
}
