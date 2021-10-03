import java.io.BufferedReader;
import java.io.InputStreamReader;

public class longest_pallindromic_subsequnce {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[][] dp = new int[str.length()][str.length()];
        for(int g = 0; g < dp.length; g++){
            for(int i = 0, j = g; j < dp[0].length; i++, j++){
                if(g == 0){
                    dp[i][j] = 1;
                } else {
                    boolean b = str.charAt(i) == str.charAt(j);
                    if(g == 1){
                        dp[i][j] = b ? 2: 1;
                    } else {
                        if(b){
                            dp[i][j] = 2 + dp[i + 1][j - 1];
                        }
                        else {
                            dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                        }
                    }
                }
            }
        }
        System.out.println(dp[0][dp[0].length - 1]);
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

