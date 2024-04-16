import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Stack<Top> stack = new Stack<>();
        
        // 탑의 개수 입력
        int n = Integer.parseInt(br.readLine());
        int[] heightArr = new int[n];

        // 탑의 높이를 배열에 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            heightArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고, 현재 탑의 높이보다 스택의 맨 위 탑의 높이가 작을 때까지 pop
            while (!stack.isEmpty() && stack.peek().height < heightArr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                sb.append(0).append(" "); // 스택이 비어있으면 0 출력
            } else {
                sb.append(stack.peek().num + 1).append(" "); // 스택의 맨 위 탑의 인덱스 출력
            }
            
            stack.push(new Top(i, heightArr[i])); // 현재 탑 스택에 추가
        }
        
        System.out.println(sb);
    }

    static class Top {
        int num; // 탑의 번호
        int height; // 탑의 높이

        Top(int num, int height) {
            this.num = num;
            this.height = height;
        }
    }
}
