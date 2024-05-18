import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위해 Scanner 객체를 생성

    int n = sc.nextInt();  // 배열의 크기 입력
    int m = sc.nextInt();  // 명령의 수 입력
    int arr[] = new int[n];  // 크기가 n인 배열 생성
    
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();  // 배열의 초기 상태 입력
    }

    for (int i = 0; i < m; i++) {  // m개의 명령어 처리
      int a = sc.nextInt();  // 명령의 유형
      int b = sc.nextInt();  // 시작 인덱스 (1-based)
      int c = sc.nextInt();  // 끝 인덱스 또는 값 (1-based)

      switch (a) {
        case 1:  // 명령 유형 1: b번째 요소를 c로 설정
          arr[b-1] = c;  // 1-based 인덱스를 0-based 인덱스로 변환
          break;

        case 2:  // 명령 유형 2: b번째부터 c번째까지 요소의 값을 반전
          for (int j = b-1; j < c; j++) {  // 1-based 인덱스를 0-based 인덱스로 변환
            if (arr[j] == 0) {  // 0이면 1로
              arr[j] = 1;
            } else {  // 1이면 0으로
              arr[j] = 0;
            }
          }
          break;

        case 3:  // 명령 유형 3: b번째부터 c번째까지 요소의 값을 0으로 설정
          for (int j = b-1; j < c; j++) {  // 1-based 인덱스를 0-based 인덱스로 변환
            arr[j] = 0;
          }
          break;

        case 4:  // 명령 유형 4: b번째부터 c번째까지 요소의 값을 1로 설정
          for (int j = b-1; j < c; j++) {  // 1-based 인덱스를 0-based 인덱스로 변환
            arr[j] = 1;
          }
          break;
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");  // 배열의 현재 상태를 출력
    }
  }
}
