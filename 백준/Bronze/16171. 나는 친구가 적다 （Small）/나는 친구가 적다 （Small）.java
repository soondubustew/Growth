import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 첫 번째 문자열 입력받기
    String str1 = sc.next();
    // 두 번째 문자열 입력받기
    String str2 = sc.next();

    // 첫 번째 문자열에서 숫자 제거하기
    String str3 = str1.replaceAll("[0-9]", "");

    // 두 번째 문자열에 첫 번째 문자열(숫자 제거된)이 포함되어 있는지 확인
    if (str3.contains(str2)) {
      // 포함되어 있으면 1 출력
      System.out.println(1);
    }
    else {
      // 포함되어 있지 않으면 0 출력
      System.out.println(0);
    }
  }
}
