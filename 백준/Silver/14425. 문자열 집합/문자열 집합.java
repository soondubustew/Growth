import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 줄에서 문자열 집합의 크기와 검사할 문자열의 개수를 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 문자열 집합의 크기
        int m = Integer.parseInt(st.nextToken()); // 검사할 문자열의 개수

        // 문자열 집합을 저장할 HashSet 객체 생성
        HashSet<String> set = new HashSet<>();

        // 문자열 집합에 문자열을 입력 받아 HashSet에 저장
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 검사할 문자열을 입력 받고, HashSet에 포함되어 있는지 확인하여 count 증가
        int count = 0;
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (set.contains(s)) {
                count++;
            }
        }

        // 검사된 문자열 중 문자열 집합에 포함된 문자열의 개수를 출력
        System.out.println(count);
    }
}
