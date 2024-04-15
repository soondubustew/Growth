import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 정수형 Deque 생성
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 입력으로부터 반복할 횟수를 받음
        int n = sc.nextInt();

        // 입력 횟수만큼 반복
        for (int i = 0; i < n; i++) {
            // 명령어 입력 받음
            String command = sc.next();

            switch (command) {
                // 정수를 Deque의 맨 앞에 추가
                case "push_front":
                    deque.addFirst(sc.nextInt());
                    break;
                // 정수를 Deque의 맨 뒤에 추가
                case "push_back":
                    deque.addLast(sc.nextInt());
                    break;
                // Deque의 맨 앞에 있는 정수를 꺼내고 출력
                case "pop_front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                // Deque의 맨 뒤에 있는 정수를 꺼내고 출력
                case "pop_back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                // Deque의 크기를 출력
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                // Deque가 비어있으면 1을, 아니면 0을 출력
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                // Deque의 맨 앞에 있는 정수를 출력
                case "front":
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                // Deque의 맨 뒤에 있는 정수를 출력
                case "back":
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        // 결과 출력
        System.out.println(sb);
    }
}
