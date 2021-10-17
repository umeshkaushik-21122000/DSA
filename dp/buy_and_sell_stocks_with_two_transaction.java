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

import java.util.Scanner;
public class buY_and_sell_stocks_with_two_transaction {
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        int note=0;
        int note2=0;
        int profit1=0;
        int profit2=0;
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<=i;j++){
                if(min1>a[j]){
                    min1=a[j];
                    note=j;
                    max1=0;
                }
                if(max1<a[j]&&j>note){
                    max1=a[j];
                }
            }
            profit1=max1-min1<0?0:max1-min1;
        //    System.out.println(profit1+"-------------------------------");
            for(int k=i;k<a.length;k++){
                if(min2>a[k]){
                    min2=a[k];
                    note2=k;
                    max2=0;
                }
                if(max2<a[k]&&k>note2){
                    max2=a[k];
                }
            }
            profit2=max2-min2<0?0:max2-min2;
           // System.out.println(profit2+"========================");
            if(profit1+profit2>maxprofit){
                maxprofit=profit1+profit2;
            }
         //   System.out.println(maxprofit+"hahahahahahahahahahahah");
             max1=Integer.MIN_VALUE;
             min1=Integer.MAX_VALUE;
             max2=Integer.MIN_VALUE;
             min2=Integer.MAX_VALUE;
        }
        System.out.println(maxprofit);

}

}
