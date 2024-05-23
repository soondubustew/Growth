import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 스캐너 객체를 생성하여 사용자 입력을 받음
    Scanner sc = new Scanner(System.in);
    
    // 크기가 31인 배열을 생성 (0번 인덱스는 사용하지 않음)
    int arr[] = new int[31];
    
    // 28명의 제출한 학생 번호를 입력받아 배열에 표시
    for (int i = 1; i <= 28; i++) {
      // 제출한 학생 번호를 입력받음
      int submit = sc.nextInt();
      // 해당 학생 번호의 배열 값을 1로 설정 (제출 표시)
      arr[submit] = 1;
    }
    
    // 배열을 순회하면서 제출하지 않은 학생 번호를 출력
    for (int i = 1; i < arr.length; i++) {
      // 배열 값이 1이 아닌 경우 (제출하지 않은 경우)
      if (arr[i] != 1) {
        // 해당 학생 번호를 출력
        System.out.println(i);
      }
    }
  }
}
