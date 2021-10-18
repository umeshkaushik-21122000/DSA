import java.io.BufferedReader;
import java.io.InputStreamReader;

public class count_pallindromic_subsequnce {
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
                        dp[i][j] = b ? 1: 0;
                    } else {
                        if(b){
                            dp[i][j] = 1;
                        }
                        else {
                            dp[i][j] =0;
                        }
                    }
                }
            }
        }
        int count=0;
        for (int[] ints : dp) {
            for (int j = 0; j < dp[0].length; j++) {
                count += ints[j];
            }

        }
        System.out.println(count);
    }
}

