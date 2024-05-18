import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위해 Scanner 객체를 생성

    int year = sc.nextInt();  // 사용자로부터 연도를 입력받음

    // 윤년 판별 로직 시작
    if (year % 4 == 0) {  // 연도가 4로 나누어 떨어지는 경우
      if (year % 100 != 0 || year % 400 == 0) {  // 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지는 경우
        System.out.println(1);  // 윤년일 경우 1을 출력
      } else {
        System.out.println(0);  // 윤년이 아닐 경우 0을 출력
      }
    } else {
        System.out.println(0);  // 윤년이 아닐 경우 0을 출력
    }
  }
}
