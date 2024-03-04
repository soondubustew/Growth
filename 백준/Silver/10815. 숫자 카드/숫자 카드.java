import java.util.HashMap;
import java.util.Scanner;

/**
 * s10815
 *
 * 이 프로그램은 정수를 입력받아 HashMap에 저장하고, 이후에 입력된 숫자가 저장되어 있는지 검사합니다.
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap map = new HashMap<Integer, Integer>(); // 정수를 저장할 HashMap 선언
        StringBuffer sb = new StringBuffer(); // 결과를 저장할 StringBuffer 선언
        
        int num = sc.nextInt(); // 숫자의 개수 입력
        int input= 0;
        for (int i = 0; i <num; i++) {
            input = sc.nextInt(); // 숫자 입력
            map.put(input , 1); // 입력된 숫자를 HashMap에 저장
        }
        
        int M = sc.nextInt(); // 검색할 숫자의 개수 입력
        int search_num = 0;
        for (int i = 0; i < M; i++) {
            search_num = sc.nextInt(); // 검색할 숫자 입력
            if (map.get(search_num) != null) { // HashMap에서 해당 숫자가 존재하는지 검사
                sb.append("1 "); // 존재하면 결과에 1 추가
            }else {
                sb.append("0 "); // 존재하지 않으면 결과에 0 추가
            }
        }
        System.out.print(sb.toString()); // 결과 출력
    }
}
