import java.util.Scanner;

public class Main {

    // 패도반 수열의 값을 저장하기 위한 배열 문제에서 n은 100이하
    static long longarr[] = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 배열을 초기화합니다. -1로 초기화하여 아직 계산되지 않은 값임을 표시
        for (int i = 0; i < longarr.length; i++) {
            longarr[i] = -1;
        }

        // 초기값 설정
        longarr[0] = 0;
        longarr[1] = 1;
        longarr[2] = 1;
        longarr[3] = 1;

        // 테스트 케이스의 수를 입력
        int t = sc.nextInt();

        // 각 테스트 케이스마다 패도반 수열 값을 계산
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sb.append(padovan(n)).append("\n");
        }
        
    
        System.out.println(sb);
    }
    
    // 재귀적으로 패도반 수열 값을 계산하는 함수
    private static long padovan(int n) {
        // 이미 계산된 값이라면 해당 값을 반환
        if(longarr[n] == -1){
            // 계산되지 않은 값이라면 재귀적으로 계산하여 배열에 저장
            longarr[n] = padovan(n - 2) + padovan(n - 3);
        }
        return longarr[n];
    }
}
