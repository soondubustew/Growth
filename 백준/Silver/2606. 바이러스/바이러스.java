import java.util.Scanner;

public class Main {
    
    static boolean check[]; // 각 컴퓨터의 방문 여부를 저장하는 배열
    static int arr[][]; // 컴퓨터 간 연결 상태를 나타내는 인접 행렬
    static int count = 0; // 감염된 컴퓨터의 개수를 저장하는 변수
    static int computer; // 컴퓨터의 개수를 저장하는 변수
    static int line; // 컴퓨터 간 연결선의 개수를 저장하는 변수
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        computer = sc.nextInt(); // 컴퓨터의 개수 입력 받음
        line = sc.nextInt(); // 컴퓨터 간 연결선의 개수 입력 받음
        check = new boolean[computer+1]; // 컴퓨터의 개수만큼의 크기로 방문 여부 배열 초기화
        arr = new int[computer+1][computer+1]; // 컴퓨터의 개수만큼의 크기로 인접 행렬 초기화

        // 컴퓨터 간 연결 정보 입력 받아 인접 행렬에 저장
        for (int i = 0; i < line; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1; // 컴퓨터 a와 b가 연결되어 있음을 표시
            arr[b][a] = 1; // 컴퓨터 b와 a가 연결되어 있음을 표시 (무방향 그래프)
        }

        dfs(1); // 깊이 우선 탐색 시작
        System.out.println(count-1); // 연결된 컴퓨터의 개수 출력 (시작점인 1번 컴퓨터는 제외)
    }

    // 깊이 우선 탐색 수행하는 메소드
    private static void dfs(int start) {
        check[start] = true; // 현재 컴퓨터를 방문했음을 표시
        count++; // 연결된 컴퓨터의 개수 증가

        // 모든 컴퓨터를 순회하면서 현재 컴퓨터와 연결된 컴퓨터를 찾음
        for (int i = 1; i <= computer; i++) {
            if (arr[start][i] == 1 && !check[i]) { // 현재 컴퓨터와 연결되어 있고, 방문하지 않은 컴퓨터라면
                dfs(i); // 해당 컴퓨터로 이동하여 재귀적으로 탐색
            }
        }
    }
}
