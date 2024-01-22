import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 다섯 줄의 단어를 저장할 배열
        String word[] = new String[5];
        
        // 다섯 줄의 단어를 사용자로부터 입력받음
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine();
        }

        // 결과를 저장할 StringBuffer 객체 생성
        StringBuffer result = new StringBuffer(15);

        // 각 단어의 동일한 위치에 있는 글자를 세로로 읽어 결과에 추가
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                // 현재 단어의 길이보다 i가 작으면 해당 위치의 글자를 결과에 추가
                if (i < word[j].length()) {
                    result.append(word[j].charAt(i));
                }
            }
        }

        // 결과 출력
        System.out.println(result.toString());

        
    }
}

