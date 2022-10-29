import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập h");
        h = sc.nextInt();
        int a,b;
        for(int i=1; i<=h;i++){
            for(int j =0; j<=2*h;j++){
                a=j-h;
                if(a<0){
                    a=a*(-1);
                }
                b=i-a;
                if(b>0){
                    System.out.printf(" * ",b);
                }else{
                    System.out.printf("   ");

                }
            }
            System.out.println();
        }
    }
}
