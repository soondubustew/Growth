import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 중복된 값을 허용하지 않는 HashSet은 등장한 이름을 저장하는 데 사용
        HashSet<String> set = new HashSet<String>();
        
        // 등장한 이름을 알파벳 순으로 정렬하여 저장하기 위한 ArrayList입니다.
        ArrayList<String> list = new ArrayList<String>();

        
        int n = sc.nextInt(); // 듣지못한 이름의 수
        int m = sc.nextInt(); // 보지못한 이름의 수

        // 등장할 이름들을 HashSet에 저장
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            set.add(name);
        }
        
        // 확인할 이름들을 입력받고, 이미 등장한 이름인 경우 ArrayList에 추가
        for (int i = 0; i < m; i++) {
            String name = sc.next();
            if (set.contains(name)) { // HashSet에 해당 이름이 존재하는지 확인
                list.add(name); // 존재하는 경우 ArrayList에 추가
            }
        }
        
        // ArrayList에 저장된 이름들을 알파벳 순으로 정렬
        Collections.sort(list);
        
        // 등장한 이름의 수와 정렬된 이름들을 출력
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
