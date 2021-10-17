/*
10
3-------0
3-------1
0-------2
2-------3
1-------4
2-------5
4-------6
2-------7
0-------8
0-------9
*/
import java.io.*;
import java.util.*;

public class climb_stair_case_with_varable_jump{

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[n+1];
        int []b=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=my.nextInt();
        }
       countvariablepath(a,b);
    }
    public static void countvariablepath(int []x,int []y){
        y[x.length-1]=1;
       for(int j=x.length-2;j>=0;j--){
                     int l=0;
            for(int k=1;k<=x[j]&&k+j<x.length;k++){
                 l+=y[j+k];
        }
        y[j]=l;
       }

    System.out.println(y[0]);


    }
}
