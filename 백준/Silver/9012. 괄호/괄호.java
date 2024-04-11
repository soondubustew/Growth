import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        // 테스트 케이스의 개수를 입력
        int num = sc.nextInt();
        
        // 각 테스트 케이스에 대해 괄호 짝을 확인하고 결과를 StringBuilder에 추가
        for (int i = 0; i < num; i++) {
            String str = sc.next();
            sb.append(isVPS(str)).append("\n");
        }
        
        // 모든 테스트 케이스의 결과를 출력
        System.out.println(sb);
    }

    // 주어진 문자열이 올바른 괄호 짝을 가지고 있는지 확인하는 메서드
    static String isVPS(String str){
        Stack<Character> stack = new Stack<>(); // 제네릭을 사용하여 스택의 타입을 명시적으로지정
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);      
            } else if (!stack.isEmpty() && c == ')') { // 스택이 비어있지 않고 ')'가 들어온 경우
                stack.pop();
            } else {
                return "NO"; // 스택이 비어있지 않은데 ')'가 들어오지 않은 경우
            }
        }
        if (stack.isEmpty()) { // 문자열을 모두 확인한 후에 스택이 비어있는지 여부를 확인
            return "YES"; // 모든 괄호가 제대로 닫혔을 경우
        } else {
            return "NO"; // 제대로 닫히지 않은 괄호가 남아있는 경우
        }
    }
}
