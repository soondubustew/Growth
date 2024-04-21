import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 나무 이름과 나무의 출현 횟수를 저장할 HashMap과 나무 이름을 저장할 HashSet을 선언
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        // 총 나무의 개수를 저장할 변수를 초기화합니다.
        int total_count = 0;

        // 무한 루프를 돌면서 나무 이름을 입력받습니다.
        while (true) {
            String tree = br.readLine();

            // 입력이 없거나 빈 문자열이라면 반복문을 종료
            if (tree == null || tree.isEmpty()) {
                break;
            }

            // 나무의 개수를 증가
            total_count++;

            // 입력된 나무를 HashSet에 추가
            set.add(tree);

            // HashMap에 나무의 출현 횟수를 저장.
            if (map.containsKey(tree)) {
                int tree_count = map.get(tree);
                map.put(tree, tree_count + 1);
            } else {
                map.put(tree, 1);
            }
        }

        // HashSet을 TreeSet으로 변환하여 나무 이름을 사전순으로 정렬
        Set<String> sortedSet = new TreeSet<>(set);

        // 사전순으로 정렬된 나무 이름을 순회하며 각 나무의 출현 비율을 계산하여 출력
        for (String tree : sortedSet) {
            // 해당 나무의 출현 횟수.
            int count = map.get(tree);
            // 나무의 출현 비율을 계산
            double ratio = (double) count / total_count * 100;
            // 나무 이름과 출현 비율을 출력
            System.out.printf("%s %.4f\n", tree, ratio);
        }
    }
}
