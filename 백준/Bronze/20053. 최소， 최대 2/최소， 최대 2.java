import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Scanner 객체를 생성하여 입력을 받음
    Scanner sc = new Scanner(System.in);
    // 결과를 저장할 StringBuilder 객체를 생성
    StringBuilder sb = new StringBuilder();
    // 테스트 케이스 개수를 입력받음
    int t = sc.nextInt();

    // 각 테스트 케이스를 처리
    for (int i = 0; i < t; i++) {
      // 각 테스트 케이스의 수의 개수를 입력받음
      int n = sc.nextInt();
      // 수들을 저장할 배열을 생성
      int arr[] = new int[n];

      // 배열에 수들을 입력받음
      for (int j = 0; j < n; j++) {
        arr[j] = sc.nextInt();
      }
      
      // 배열의 첫 번째 요소로 초기 최소값과 최대값 설정
      int max = arr[0];
      int min = arr[0];

      // 배열을 순회하며 최소값과 최대값을 찾음
      for (int j = 1; j < arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
        }
        if (arr[j] > max) {
          max = arr[j];
        }
      }
      // 최소값과 최대값을 StringBuilder에 추가
      sb.append(min + " " + max).append("\n");
    }

    // StringBuilder에 저장된 결과를 출력
    System.out.println(sb);

    // Scanner 객체를 닫아 리소스를 해제
    sc.close();
  }
}
