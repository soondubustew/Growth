import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받음으로써 입력 속도를 향상시킵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // HashMap 객체 생성
        // map: 숫자를 키로 가지고 포켓몬 이름을 값으로 가지는 맵
        // reverseMap: 포켓몬 이름을 키로 가지고 숫자를 값으로 가지는 맵
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> reverseMap = new HashMap<>();

        // 포켓몬의 개수 n과  문제의 개수 m을 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n개의 포켓몬 이름을 입력 받고, 각 포켓몬을 map과 reverseMap에 저장
        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            map.put(i, pokemon); // map에 숫자를 키로, 포켓몬 이름을 값으로 저장
            reverseMap.put(pokemon, i); // reverseMap에 포켓몬 이름을 키로, 숫자를 값으로 저장
        }

        // m번 반복하며 처리
        for (int i = 0; i < m; i++) {
            String s = br.readLine(); // 문자열 입력 받기

            // 입력된 문자열이 알파벳 대문자로 시작하는지 확인
            if (Character.isUpperCase(s.charAt(0))) {
                // 값이 입력된 문자열과 일치하는 키를 reverseMap에서 찾아서 출력합니다.
                Integer key = reverseMap.get(s);
                if (key != null) {
                    sb.append(key).append("\n"); // StringBuilder에 추가
                }
            } else { // 입력된 문자열이 숫자인 경우
                int number = Integer.parseInt(s); // 문자열을 정수로 변환
                sb.append(map.get(number)).append("\n"); // 해당하는 값을 StringBuilder에 추가
            }
        }

        // 결과 출력
        System.out.print(sb);
    }
}
