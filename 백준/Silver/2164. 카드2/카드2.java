import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>(); // 정수형 Queue를 생성
        int num = sc.nextInt(); // 사용자로부터 정수를 입력

        // 1부터 입력받은 수(num)까지의 숫자를 Queue에 추가
        for (int i = 1; i <= num; i++) {
            q.add(i);
        }
        
        // 숫자를 제거하고 다시 넣는 작업을 반복
        // 이 작업은 마지막 하나의 숫자가 남을 때까지 진행
        for (int i = 0; i < num - 1; i++) {
            q.poll(); // Queue의 맨 앞에 있는 숫자를 제거
            int topnum = q.peek(); // 현재 Queue의 맨 앞에 있는 숫자를 변수에 저장
            q.remove(); // 변수에 저장된 숫자를 Queue에서 제거
            q.add(topnum); // 변수에 저장된 숫자를 Queue의 맨 뒤에 추가
        }

        // 마지막으로 남은 숫자를 출력
        System.out.println(q.peek());
    }
}
