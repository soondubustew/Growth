import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성

    int n = sc.nextInt(); // 숫자의 길이를 입력받음
    int sum = 0; // 합계를 저장할 변수 초기화
    String str = sc.next(); // 숫자를 문자열로 입력받음

    for (int i = 0; i < n; i++) {
      sum += str.charAt(i) - '0'; // 각 문자를 숫자로 변환하여 합계에 더함
    }
    
    System.out.println(sum); // 최종 합계를 출력
  }
}
