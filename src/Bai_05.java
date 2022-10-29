import java.util.Scanner;

public class Bai_05 {
    public static void main(String[] args) {
        int n;
        System.out.println("nhập n");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n<0){
            System.out.println("nhập lại");
        }else{
            int dao=0;
            int m=n;
            while(m>0){
                dao=dao*10+n%10;
                m=m/10;
            }
            if(dao==n){
                System.out.println("la so thuận nghịch"+n);
            }else{
                System.out.println("ko phải số thuận nghịch");
            }
        }
        }
}
