import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성
    HashMap<String, Integer> map = new HashMap<>();  // 확장자와 그 개수를 저장할 HashMap
    ArrayList<String> list = new ArrayList<>();  // 확장자 목록을 저장할 ArrayList
    StringBuilder sb = new StringBuilder();  // 결과 출력을 위한 StringBuilder
    
    int n = sc.nextInt();  // 파일의 개수를 입력 받음

    for (int i = 0; i < n; i++) {
      String str = sc.next();  // 파일 이름을 입력 받음
      String s_str[] = str.split("\\.");  // 파일 이름을 확장자와 분리 (정규식을 사용해 분리)
      String file = s_str[1];  // 확장자를 추출
      if (!map.containsKey(file)) {  // 확장자가 처음 등장하면
        list.add(file);  // 확장자 목록에 추가
      }
      map.put(file, map.getOrDefault(file, 0) + 1);  // 확장자의 개수를 증가
    }
    
    Collections.sort(list);  // 확장자 목록을 정렬
    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i)).append(" ").append(map.get(list.get(i))).append("\n");  // 확장자와 개수를 StringBuilder에 추가
    }
    
    System.out.println(sb);  // 최종 결과 출력
  }
}
