
import java.util.Scanner;
public class buy_and_sell_stocks_with_fees {
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        int fees=my.nextInt();
        for(int i=0;i<a.length;i++){

        }
        int x=Integer.MIN_VALUE;
        int oss=0;
        int obs=-a[0];
        for(int i=1;i<a.length;i++){
          int nss=0;
          int nbs=0;
          if(oss-a[i]>obs){
              nbs=oss-a[i];
          }
          else{
              nbs=obs;
          }
          if(obs+a[i]-fees>oss) {
              nss=obs+a[i]-fees;
          }
          else{
              nss=oss;
          }
          oss=nss;
          obs=nbs;
        }
        System.out.println(oss);

    }
}
