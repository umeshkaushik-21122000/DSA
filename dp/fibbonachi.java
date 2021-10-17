import java.util.Scanner;

public class fibbonachi{

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int []a=new int[2];
        int x=fibn(n,a);
        System.out.println(x);
    }
public static int fibn(int n,int []a){
        if(n==1||n==0){
            return n;
        }
        if(a[1]!=0){
           return n%2==0?a[1]:a[0];
        }

       int x= fibn(n-1,a);
        int y=fibn(n-2,a);
        if(n%2==0){
         a[1]=x+y;
        }
        else{
            a[0]=x+y;
        }
return x+y;}
}
