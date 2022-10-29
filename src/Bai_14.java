import java.util.Scanner;

public class Bai_14 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        if (n <= 0) {
            System.out.println("nhap n>0");
        }else {
            int i;
            for (i = 0; i < n; i += 2) {
                System.out.println("so chan " +i);
            }
            for (i = 1; i < n; i += 2) {
                System.out.println("so le "+i);
            }


        }
    }
}
