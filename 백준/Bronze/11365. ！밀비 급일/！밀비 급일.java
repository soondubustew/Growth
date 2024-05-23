import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성
    
    StringBuilder print_sb = new StringBuilder(); // 최종 출력 문자열을 저장할 StringBuilder 객체 생성
    while (true) {
      String str = sc.nextLine(); // 한 줄을 입력받음

      if (str.equals("END")) { // 입력이 "END"이면 루프를 종료
        break;
      }
      StringBuilder reverse_sb = new StringBuilder(str); // 현재 입력받은 문자열로 StringBuilder 객체 생성
      
      print_sb.append(reverse_sb.reverse()).append("\n"); // 문자열을 뒤집어서 print_sb에 추가

    }
    System.out.println(print_sb); // 최종 결과를 출력
  }
}
