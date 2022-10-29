import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập m");
        m = sc .nextInt();
        System.out.println("nhap n");
        n = sc .nextInt();
        int count =0;
        if((m>=0 && n>=0)||n >=0){
            for(int i=m ;i<=n; i++){
                if(i>=0){
                    int kq=(int)Math.sqrt(i);
                    if(kq*kq==i){
                        count++;
                        System.out.printf("",i);
                        if(count%10==0){

                        }
                    }
                }

            }
        }
        System.out.println(+count);
    }
}
