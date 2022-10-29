import java.util.Scanner;

public class Bai_11b_c {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n = sc.nextInt();
           if(n%2==0){
               i=2;
           }else{
               i=1;
           }
           int sum =0;
           for( ; i<=n;i+=2){
               sum=sum+i;
           }
        System.out.println(sum);
    }
}
