import java.util.Scanner;

public class Bai_15 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        System.out.println("nhap m");
        m=sc.nextInt();
        if(m>0 && n>0){
            while(m!=n){
                if(m>n){
                    m=m-n;
                }else{
                    n=n-m;
                }
            }
            if(m==1){
                System.out.println("hai so nguyen tố cùn nhau");
            }else{
                System.out.println("ko phải hai số nguyên tố cùng nhau");
            }
            System.out.println();
        }else{
        }
    }
}
