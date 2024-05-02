import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수 n을 입력 받음
        int n = sc.nextInt();

        // 크기가 n+1인 배열 fi 선언
        int fi[] = new int[n+1];

        // 각 배열 요소에 피보나치 수를 계산하여 저장
        for (int i = 0; i < fi.length; i++) {
            // 첫 번째와 두 번째 피보나치 수 초기화
            if(i == 0){
                fi[i] = 0;
            }
            else if (i == 1) {
                fi[i] = 1;
            }
            // 그 외의 경우, 이전 두 피보나치 수의 합 계산
            else{
                fi[i] = fi[i-2] + fi[i-1];
            }
        }
        
        // n번째 피보나치 수 출력
        System.out.println(fi[n]);
    }
}
