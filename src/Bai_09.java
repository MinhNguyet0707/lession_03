import java.util.Scanner;

public class Bai_09 {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao m");
        m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}