import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner m =new Scanner(System.in);
        String s=m.next();
        long []dp=new long[s.length()+1];
        HashMap<Character,Integer>x=new HashMap<>();
        x.put(s.charAt(0),0);
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
                char c=s.charAt(i-1);
                if(x.containsKey(c)){
                    int idx=x.get(c);
                    long l=idx-1>=0?dp[idx-1]:0;
                    dp[i]=2*dp[i-1]-l;
                }
                else{
                    dp[i]=2*dp[i-1];
                }
            x.put(c,i);
        }
        System.out.println((dp[s.length()])-1);

    }
}
