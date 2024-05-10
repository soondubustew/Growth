import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    static int arr[][]; // 그래프의 인접 행렬을 저장하는 배열
    static boolean check[]; // 방문 여부를 확인하는 배열
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    // 정점의 개수, 간선의 개수, 시작 정점을 입력
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int v = sc.nextInt();

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {

        // 그래프를 인접 행렬로 초기화
        arr = new int[n+1][n+1];
        check = new boolean[n+1];

        // 간선 정보를 입력 받아 인접 행렬에 반영
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // DFS를 호출하여 시작 정점부터 탐색을 시작
        dfs(v);
        sb.append("\n");
        // 방문 여부 배열을 초기화하고 BFS를 호출하여 시작 정점부터 탐색을 시작
        check = new boolean[n+1];
        bfs(v);

        // 결과를 출력
        System.out.println(sb);
    }

    // BFS 탐색을 수행하는 메서드
    static void bfs(int v) {
        q.add(v);
        check[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            sb.append(v).append(" ");
            // 현재 정점과 연결된 모든 정점을 확인
            for (int i = 0; i <= n; i++) {
                // 현재 정점과 연결되어 있고 방문하지 않은 정점이라면 큐에 추가하고 방문 표시
                if (arr[v][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }   
    }

    // DFS 탐색을 수행하는 메서드
    static void dfs(int v) {
        check[v] = true;
        sb.append(v + " ");

        // 현재 정점과 연결된 모든 정점을 확인
        for (int i = 0; i <= n; i++) {
            // 현재 정점과 연결되어 있고 방문하지 않은 정점이라면 재귀적으로 탐색
            if (arr[v][i] == 1 && !check[i]) {
                dfs(i);
            }
        }
    }
}
