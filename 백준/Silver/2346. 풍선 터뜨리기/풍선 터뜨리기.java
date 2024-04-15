import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 결과를 저장할 StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();
        
        // 풍선 정보를 저장하기 위한 Deque 객체 생성
        Deque<Ballboon> q = new ArrayDeque<>();
        
        // 풍선의 개수를 입력 받음
        int n = sc.nextInt();

        // 풍선 정보를 입력 받아 Deque에 추가
        for (int i = 1; i <= n; i++) {
            // 각 풍선의 번호와 이동 거리를 입력 받아 Deque에 추가
            q.add(new Ballboon(i, sc.nextInt()));  
        }
        
        // 풍선 이동 처리
        while (!q.isEmpty()) {
            // Deque에서 현재 위치의 풍선을 꺼냄
            Ballboon current = q.pollFirst();
            // 결과 문자열에 현재 풍선의 번호를 추가
            sb.append(current.num).append(" ");
            
            // 현재 풍선의 이동 거리를 저장
            int value = current.value;
            // 이동 거리가 0이 아닌 경우에만 처리
            if (value != 0) {
                // 이동 거리가 양수인 경우
                if (value > 0) {
                    // 앞으로 이동
                    for (int i = 0; i < value - 1; i++) {
                        // Deque에서 풍선을 빼내어 뒤로 추가
                        if (!q.isEmpty()) {
                            q.addLast(q.pollFirst());
                        }
                    }    
                } else { // 이동 거리가 음수인 경우
                    // 뒤로 이동
                    for (int i = 0; i < Math.abs(value); i++) {
                        // Deque에서 풍선을 빼내어 앞으로 추가
                        if (!q.isEmpty()) {
                            q.addFirst(q.pollLast());
                        }
                    }
                }
            }
        }
        
        // 결과 문자열 출력
        System.out.println(sb);
    }

    // 풍선을 나타내는 클래스
    static class Ballboon {
        int num; // 풍선의 번호
        int value; // 풍선의 이동 거리
        // 생성자
        Ballboon(int num, int value) {
            this.num = num;
            this.value = value;
        }
    }
}
