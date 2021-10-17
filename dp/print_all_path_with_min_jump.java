import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class print_all_path_with_min_jump {
    public static class pair{
        int i;
        int j;
        String psf;
        pair(int i ,int j ,String psf){
            this.i=i;
            this.j=j;
            this.psf=psf;
        }

    }
    public static void main(String [] args) {
        Scanner m = new Scanner(System.in);
        int n = m.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = m.nextInt();
        int []dp=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int steps=arr[i];
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=steps;j++)
                if(i+j<arr.length)
                    min=Math.min(min,dp[i+j]);
            dp[i]=min==Integer.MAX_VALUE?min:min+1;
        }
        System.out.println(dp[0]);
        Queue<pair> x=new ArrayDeque<>();
        pair t=new pair(0,dp[0],0+"");
        x.add(t);
        while(x.size()>0){
            pair rem=x.remove();
            if(rem.j==0){
                System.out.println(rem.psf+" .");
                continue;
            }
            for(int i=1;i<=arr[rem.i];i++){
                int cd=i+rem.i;
                if(cd<dp.length&&dp[cd]==rem.j-1)
                    x.add(new pair(cd,rem.j-1,rem.psf+" -> "+(cd)));
            }
        }

    }
}
