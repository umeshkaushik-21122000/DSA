import java.io.*;
public class queen_permutation2{
    public static void queensPermutations(int qpsf, int tq, int[][] chess){
        if(qpsf==tq){
            for(int i=0;i<chess.length;i++){
                for(int j=0;j<chess[0].length;j++){
                    if(chess[i][j]==0){
                        System.out.print("- ");
                    }
                    else{
                        System.out.print("q"+chess[i][j]+" ");
                    }
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                if(chess[i][j]==0){
                    chess[i][j]=qpsf+1;
                    queensPermutations(qpsf+1,tq,chess);
                    chess[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        queensPermutations(0, n, chess);
    }
}