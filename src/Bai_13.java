import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n =sc.nextInt();
        int sum=0;
        int i=0;
        for(i=7;i<=n;i+=7){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
