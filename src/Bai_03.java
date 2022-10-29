import java.util.Scanner;

public class Bai_03 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a");
        a = sc.nextInt();
        System.out.println("nhập vào số b");
        b = sc.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }
    public static int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int uscln = a;
        return uscln;
        }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
