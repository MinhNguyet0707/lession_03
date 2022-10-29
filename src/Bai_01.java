import java.util.Scanner;

public class Bai_01 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số a");
        a = sc.nextInt();
        System.out.println("nhập vào số b");
        b = sc.nextInt();
        System.out.println("nhập vào số c");
        c = sc.nextInt();
        System.out.println("nhập vào số d");
        d = sc.nextInt();
        if (a >= b && a >= c && a >= d) {
            System.out.println("a là số lớn nhất");
        } else if (b >= a && b >= c && b >= d) {
            System.out.println("b la so lon nhat");
        } else if (c >= a && c >= b && c >= d) {
            System.out.println("c la so lon nhat");
        } else {
            System.out.println("d la so lon nhất");
        }
    }
}
