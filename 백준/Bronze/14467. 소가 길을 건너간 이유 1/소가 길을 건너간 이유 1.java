import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위해 Scanner 객체를 생성
    int n = sc.nextInt();  // 관찰 횟수 입력
    HashMap<Integer, Integer> map = new HashMap<>();  // 소의 번호와 위치를 저장할 HashMap 생성
    int count = 0;  // 위치 변경 횟수 초기화
    
    for (int i = 1; i <= n; i++) {  // n번의 관찰 입력 처리
      int num = sc.nextInt();  // 소의 번호 입력
      int place = sc.nextInt();  // 소의 위치 입력
      
      if (!map.containsKey(num)) {  // HashMap에 소의 번호가 없으면
        map.put(num, place);  // 현재 위치를 추가
      } else {
        int current = map.get(num);  // HashMap에서 현재 위치를 가져옴
        if (current != place) {  // 이전 위치와 다른 경우
          count++;  // 위치 변경 횟수 증가
          map.put(num, place);  // 새로운 위치로 업데이트
        }
      }
    }
    System.out.println(count);  // 위치 변경 횟수 출력
  }
}
