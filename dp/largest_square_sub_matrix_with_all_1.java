import java.util.Scanner;

public class largest_square_sub_matrix_with_all_1
{
    public static int solution(int[][] arr) {
        int [][]dp=new int[arr.length][arr[0].length];
        for(int i=0;i<dp[0].length;i++){
            dp[arr.length-1][i]=arr[arr.length-1][i];
        }
        for(int i=0;i<arr.length-1;i++){
            dp[i][arr[0].length-1]=arr[i][arr[0].length-1];
        }
        int max=0;
        for(int i=arr.length-2;i>=0;i--)
            for(int j=arr[0].length-2;j>=0;j--)
                if(arr[i][j]==1){
                    dp[i][j]=Math.min(Math.min(dp[i+1][j],dp[i][j+1]),dp[i+1][j+1])+1;
                    max=Math.max(max,dp[i][j]);
                }
        return max;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m =scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(solution(arr));

    }
}
