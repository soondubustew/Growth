import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[20];
        String split_arr[][] = new String[20][3];
        for (int i = 0; i < 20; i++) {
            s[i] = sc.nextLine();

        }
        
        for (int i = 0; i < 20; i++) {
            
                split_arr[i] = s[i].split(" ");
    
            }
        
        
        double a_total_sum = 0;//학점*과목평점의 합
        double b_total_sum = 0;//학점의 총합
        double  point = 0;//학점
        double avg = 0;//과목평점
        
        double grade = 0;//등급
        for (int i = 0; i < 20; i++) {
            if(!split_arr[i][2].equals("P"))
            {
                switch (split_arr[i][2]) {
                    case "A+":
                        grade = 4.5;
                        break;
                    case "A0":
                        grade = 4.0;
                        break;
                    case "B+":
                        grade = 3.5;
                        break;
                    case "B0":
                        grade = 3.0;
                        break;
                    case "C+":
                        grade = 2.5;
                        break;
                    case "C0":
                        grade = 2.0;
                        break;
                    case "D+":
                        grade = 1.5;
                        break;
                    case "D0":
                        grade = 1.0;
                        break;
                    case "F":
                        grade = 0.0;
                        break;
                    
    
                    default:
                        break;
                }
    
                point = Double.parseDouble(split_arr[i][1]);
                
                avg = point * grade;
                //학점 * 과목평점의 합
                a_total_sum += avg;
                //학점의 총합
                b_total_sum += point;
            }
            
        }
        

        
        //전공평점은 전공과목별(학점 * 과목평점)의 합을 학점의 총합으로 나누는것
        System.out.println(a_total_sum/b_total_sum);
    }
}
