import java.util.Scanner;

public class Bai_08 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao m");
        m = sc.nextInt();
        System.out.println("nhap vao n");
        n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j ==0 || i== m-1 || j==n-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            }
        }
    }