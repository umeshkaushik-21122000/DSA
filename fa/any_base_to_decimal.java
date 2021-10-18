import java.awt.*;
import java.util.Scanner;

public class any_base_to_decimal {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        int b=my.nextInt();
        base(a,b);
    }
    public static void base(int x,int y){
       int c=0,count=0,d=0;
        while(x!=0){
            c=x%10;
            d=d+c*(int)Math.pow(y,count);
            count++;
            x=x/10;
        }
        System.out.println(d);

    }
}
