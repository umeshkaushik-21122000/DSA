import java.io.BufferedReader;
import java.io.InputStreamReader;

public class queen_combination{
    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
        if(row==tq-1&&col==tq){
            if(qpsf==tq){
                String[] s = asf.split(" ");
                for (int i = 0; i < s.length; i++) {
                    System.out.println(s[i]);
                }
                System.out.println();
            }
            return;
        }
        if(col==tq){
        row++;
        col=0;
        asf+=" ";
        }
        if(qpsf==tq)
        {
            queensCombinations(qpsf,tq,row,col+1,asf+"-");
        }
        else{
        queensCombinations(qpsf+1,tq,row,col+1,asf+"q");
        queensCombinations(qpsf,tq,row,col+1,asf+"-");
    }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        queensCombinations(0, n, 0, 0, "");
    }
}
