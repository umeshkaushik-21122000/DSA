import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution2(arr);
    }
        public static void solution2(int []arr){
        int xoy=0;
        for(int a : arr){
            xoy=xoy^a;
        }
        int rsb=xoy&-xoy;
        int x=0;
        int y=0;
        for(int a : arr){
            if((a&rsb)==0){
                x=x^a;
            }
            else{
                y=y^a;
            }
        }
        if(x>y){
            System.out.println(y);
            System.out.println(x);}
            else{
            System.out.println(x);
            System.out.println(y);
            }
        }
    }
