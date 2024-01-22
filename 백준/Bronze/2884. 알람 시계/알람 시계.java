import java.util.Scanner;

public class Main {
    //시간을 출력하는 메서드
    static void clock(int hour, int min){
        System.out.println(hour + " " + min);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc. nextInt();
        // 시간 범위 설정
        if(hour >= 0 && hour <= 23 && min >= 0 && min <= 59)
        {
            if(hour == 0 && min < 45)
            {
                hour = 23;
                min = min +15;
            }else if(min < 45 && hour > 0)
            {
                hour--;
                min = min + 15;
            }else if(min >= 45){
                min = min -45;
            }
        
            clock(hour, min);

        }
    }
}
