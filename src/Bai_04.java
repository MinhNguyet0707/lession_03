import java.util.Scanner;

public class Bai_04 {
    public static void main(String[] args) {
        int n;
        int a = 1;
        int b = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        n = scanner.nextInt();
        if (n >= 1)
        {
            System.out.println(n+" Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for ( int i = 2 ; i <=n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(b) ; j++ )
            {
                if ( b%j == 0 )
                {
                    a = 0;
                    break;
                }
            }
            if ( a != 0 )
            {
                System.out.println(b);
                i++;
            }
            a = 1;
            b++;
        }
    }
    }

