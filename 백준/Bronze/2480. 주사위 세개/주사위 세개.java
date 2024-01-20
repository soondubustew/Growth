import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int ab_count = 0;
        int bc_count = 0;
        int ca_count = 0;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if( a == b && b == c && c == a)
        {
            count = 2;
        }
        else if(a == b)
        {
            count++;
            ab_count++;
        }
        else if(b == c)
        {
            count++;
            bc_count++;
        }
        else if(c == a)
        {
            count++;
            ca_count++;
        }
        
        
        //같은 눈이 3개일때
        if(count == 2 )
        {
            System.out.println(10000 + a * 1000);
        }
        
        //같은 눈이 2개일때
        if(count == 1 && ab_count == 1)
        {
            System.out.println(1000 + a * 100);
        }
        if(count == 1 && bc_count == 1)
        {
            System.out.println(1000 + b * 100);
        }
        if(count == 1 && ca_count == 1)
        {
            System.out.println(1000 + c * 100);
        }
        //모두 다른 눈 일때
        if(count == 0)
        {
            int max = a > b ? a:b;
            max = max > c ? max : c;
            System.out.println(max*100);


        }

    }
    
}
