import java.util.ArrayList;
import java.util.Scanner;

class Stack {
    // 정수형 ArrayList를 사용하여 스택 구현
    ArrayList<Integer> stack = new ArrayList<Integer>();

    // 스택에 정수를 추가하는 메서드
    void push(int a) {
        stack.add(a);
    }

    // 스택에서 정수를 제거하고 반환하는 메서드
    int pop() {
        if (isEmpty()) {
            // 스택이 비어 있으면 -1 반환
            return -1;
        } else {
            int lastnum = stack.size() - 1;
            int popnum = stack.get(lastnum);
            stack.remove(lastnum);
            return popnum; // 제거된 정수 반환
        }
    }

    // 스택이 비어 있는지 확인하는 메서드
    boolean isEmpty() {
        return stack.isEmpty();
    }

    // 스택의 크기를 반환하는 메서드
    int size() {
        return stack.size();
    }

    // 스택이 비어 있으면 1, 비어 있지 않으면 0 반환하는 메서드
    int empty() {
        if (isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    // 스택의 가장 위에 있는 정수를 반환하는 메서드
    int top() {
        if (isEmpty()) {
            // 스택이 비어 있으면 -1 반환
            return -1;
        } else {
            return stack.get(stack.size() - 1); // 가장 위의 정수 반환
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        int num = sc.nextInt(); // 입력 받을 명령의 수

        // 입력 받을 명령의 수만큼 반복
        for (int i = 0; i < num; i++) {
            String s = sc.next(); // 명령 문자열 입력

            // 명령에 따라 스택 동작 실행
            switch (s) {
                case "push":
                    stack.push(sc.nextInt()); // 정수 입력 받아 스택에 추가
                    break;
                case "pop":
                    sb.append(stack.pop()).append("\n"); // 스택에서 정수 제거하고 결과를 StringBuilder에 추가
                    break;
                case "size":
                    sb.append(stack.size()).append("\n"); // 스택의 크기를 StringBuilder에 추가
                    break;
                case "empty":
                    sb.append(stack.empty()).append("\n"); // 스택이 비어 있는지 여부를 StringBuilder에 추가
                    break;
                case "top":
                    sb.append(stack.top()).append("\n"); // 스택의 가장 위에 있는 정수를 StringBuilder에 추가
                    break;
            }
        }
        System.out.println(sb); // 결과 출력
    }
}
