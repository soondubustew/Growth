import java.util.Scanner;

public class Main {
  static int arr[][] = new int[5][5];  // 5x5 빙고 판 배열
  static int total_count = 0;  // 빙고 줄 수를 저장하는 변수

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 5x5 빙고 판을 입력받음
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // 숫자를 하나씩 부름
    for (int i = 1; i <= 25; i++) {
      int num = sc.nextInt();
      
      // 부른 숫자를 빙고 판에서 0으로 변경
      for (int k = 0; k < 5; k++) {
        for (int k2 = 0; k2 < 5; k2++) {
          if (arr[k][k2] == num) {
            arr[k][k2] = 0;
          }
        }
      }

      // 빙고 체크
      row_check();  // 행 체크
      column_check();  // 열 체크
      ld_check();  // 왼쪽 대각선 체크
      rd_check();  // 오른쪽 대각선 체크

      // 3줄 이상 빙고가 완성되면 해당 숫자의 순서를 출력하고 종료
      if (total_count >= 3) {
        System.out.println(i);
        break;
      }

      total_count = 0;  // 매번 체크하기 전에 초기화
    }
  }

  // 행 체크 함수
  private static void row_check() {
    for (int i = 0; i < 5; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        if (arr[i][j] == 0) {
          count++;
        }
      }
      if (count == 5) {  // 행에 5개의 0이 있으면 빙고
        total_count++;
      }
    }
  }

  // 열 체크 함수
  private static void column_check() {
    for (int i = 0; i < 5; i++) {
      int count = 0;
      for (int j = 0; j < 5; j++) {
        if (arr[j][i] == 0) {
          count++;
        }
      }
      if (count == 5) {  // 열에 5개의 0이 있으면 빙고
        total_count++;
      }
    }
  }

  // 오른쪽 대각선 체크 함수
  private static void rd_check() {
    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (arr[i][i] == 0) {
        count++;
      }
    }
    if (count == 5) {  // 오른쪽 대각선에 5개의 0이 있으면 빙고
      total_count++;
    }
  }

  // 왼쪽 대각선 체크 함수
  private static void ld_check() {
    int count = 0;
    for (int i = 0; i < 5; i++) {
      if (arr[i][4 - i] == 0) {
        count++;
      }
    }
    if (count == 5) {  // 왼쪽 대각선에 5개의 0이 있으면 빙고
      total_count++;
    }
  }
}
