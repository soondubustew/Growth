import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        // 우선순위 큐를 생성. Collections.reverseOrder()를 사용하여 최대 힙으로 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력으로 주어지는 숫자의 개수를 입력
        int n = Integer.parseInt(br.readLine());

        // n번 반복하여 숫자를 입력받고 처리
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            // 입력된 숫자가 0일 경우
            if (x == 0) {
                // 우선순위 큐가 비어있는지 확인하고, 비어있으면 0을 출력
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    // 우선순위 큐에서 최대값을 꺼내어 출력.
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                // 입력된 숫자가 0이 아니면 우선순위 큐에 추가
                pq.add(x);
            }
        }

        // 결과를 출력
        System.out.println(sb);
    }
}
