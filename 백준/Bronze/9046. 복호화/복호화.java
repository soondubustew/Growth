import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    
    int t = sc.nextInt(); // 테스트 케이스의 수를 입력 받음
    sc.nextLine(); // 개행 문자를 소비하여 이후 입력에 영향을 주지 않도록 함

    for (int i = 0; i < t; i++) {
      String str = sc.nextLine(); // 각 테스트 케이스에 대한 문자열을 입력 받음
      HashMap<Character, Integer> map = new HashMap<>(); // 각 문자열마다 새로운 해시맵 생성
      
      // 문자열의 각 문자의 빈도를 계산하여 해시맵에 저장
      for (int j = 0; j < str.length(); j++) {
        char ch = str.charAt(j);
        if (ch != ' ') { // 공백 문자는 무시
          map.put(ch, map.getOrDefault(ch, 0) + 1); // 해당 문자의 빈도를 1 증가시킴
        }
      }

      int maxkey = 0; // 최대 빈도수를 저장할 변수
      boolean tie = false; // 최대 빈도수가 동일한 문자가 여러 개 있는지 여부를 저장할 변수
      char frechar = '?'; // 가장 빈도수가 높은 문자를 저장할 변수
      
      // 해시맵을 순회하면서 가장 빈도수가 높은 문자를 찾음
      for (Character key : map.keySet()) {
        int curkey = map.get(key);
        if (maxkey < curkey) {
          maxkey = curkey; // 최대 빈도수를 갱신
          frechar = key; // 가장 빈도수가 높은 문자를 갱신
          tie = false; // 최대 빈도수가 동일한 문자가 여러 개 있는지 여부를 갱신
        } else if (curkey == maxkey) {
          tie = true; // 동일한 빈도수를 가진 다른 문자가 있으면 tie를 true로 설정
        }
      }
      
      // 결과 문자열에 가장 빈도수가 높은 문자 또는 '?' 추가
      if (tie) {
        sb.append("?").append("\n"); // 동일한 빈도수의 문자가 여러 개 있는 경우
      } else {
        sb.append(frechar).append("\n"); // 가장 빈도수가 높은 문자가 하나인 경우
      }
    }
    
    System.out.println(sb); // 모든 결과를 출력
  }
}
