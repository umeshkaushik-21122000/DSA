import java.io.*;
import java.util.*;
public class kernigahanas_algo {
    public static void main(String[] args){
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
            int count=0;
        while(a!=0){
            int rsb=a&-a;
            a-=rsb;
            count++;
        }
        System.out.println(count);

}
}
