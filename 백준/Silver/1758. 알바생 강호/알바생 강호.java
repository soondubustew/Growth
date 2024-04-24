import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //손님의 수
        int n = sc.nextInt();
        // 총 팁의 액수
        long total = 0;
        Integer tip[] = new Integer[n];
        
        for (int i = 0; i < n; i++) {
            tip[i] = sc.nextInt();
        }
        //내림차순 정렬
        Arrays.sort(tip, Comparator.reverseOrder());
        //계산식 적용
        for (int i = 0; i < n; i++) {
            int temp = tip[i] - i;
            if (temp < 0) {
                temp = 0;
            }
            total += temp;
        }
        System.out.println(total);
        

    }
}
