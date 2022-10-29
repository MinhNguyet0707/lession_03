import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n = sc.nextInt();
        int sum=0;
        for(int i = 1; i <= n; ++i)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
