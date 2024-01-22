import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 스캐너 객체를 생성하여 사용자로부터 입력을 받음
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 여러 단어를 포함한 문자열을 입력받음
        String input = sc.nextLine();
        // 문자열이 공백으로 시작하거나 끝날 수 있으므로 trim()으로 앞뒤 공백 제거
        input = input.trim();
        String words[];
        int wordCount = 0;
        if(input.isEmpty())
        {
            print(wordCount);
        }else{
         //입력된 문자열을 공백을 기준으로 나누어 배열에 저장
        words = input.split(" ");
        // 배열의 길이, 즉 단어의 개수를 계산
        wordCount = words.length;
        print(wordCount);
        }
        
        
        

        
    }
    static void print(int wordCount)
    {
        System.out.println(wordCount);
    }
}
