import java.io.*;
import java.util.*;

public class josephus_case_special {

    public static int solution(int n){
            int x=(int)(Math.log(n)/Math.log(2));
                int k=n-(int)Math.pow(2,x);
                int g=1;
                for(int i=1;i<=k;i++){
                    g+=2;
                }
        return g;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        for(int i=1;i<=x;i++){
        int n = scn.nextInt();
        System.out.println(solution(n));
        }
    }

}
