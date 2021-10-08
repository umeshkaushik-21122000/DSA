import java.util.Scanner;

public class Main{

    public static int solution(int n) {
        int count=n;
        int sq=(int)Math.sqrt(n);
        int []dp=new int[sq];
            dp[0]=n;
        for(int i=1;i<sq;i++){
            int mcount=0;
            int nc=n;
            for(int j=i+1;j>0;j--){
                 int div=nc/(j*j);
                nc= nc%(j*j);
                mcount+=div;
            }
            dp[i]=mcount;
            count=Math.min(dp[i],count);
        }
    return count;}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }



}
