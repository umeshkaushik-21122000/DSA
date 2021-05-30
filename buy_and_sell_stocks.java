/*
9
11
6
7
19
4
1
6
18
4
 */
import java.util.*;
public class buy_and_sell_stocks{
    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=my.nextInt();
        }
        int []profit=new int[n];
        profit[0]=a[0];
        int p=0;
        int pmax=0;
        for(int i=1;i<a.length;i++){
            for(int j=i-1;j>=0;j--){
                if(a[i]>a[j]){
                 p=a[i]-a[j];
                }
                if(p>pmax){
                    pmax=p;
                }
            }
            profit[i]=pmax;
        }

            System.out.println(profit[n-1]);


        }

    }
