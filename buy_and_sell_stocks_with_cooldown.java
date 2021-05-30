import java.util.Scanner;

public class buy_and_sell_stocks_with_cooldown {
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
       int oss=0;
        int obs=0;
        int j=0;
        int cooldown=0;
        for(int i=0;i<a.length-1;){
            j=i+1;
            if(a[j]>a[i]){
                obs=oss-a[i];
            }
            while(a[j]>a[i]){
                oss+=a[j]-a[i];
                System.out.println(oss);
                j++;
                i++;
                cooldown=1;
                if(j==a.length){
                    break;
                }
            }
            i++;
            if(cooldown==1){
                i++;
                cooldown=0;
            }
        }


    }
}
