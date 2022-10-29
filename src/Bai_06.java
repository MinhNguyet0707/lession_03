import java.util.Scanner;

public class Bai_06 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n= sc.nextInt();
        int sum =0;
        while (n>0){
           sum=sum+(n%10);
           n=n/10;
        }
        System.out.println(sum);
    }
}
