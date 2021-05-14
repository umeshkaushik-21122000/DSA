import java.util.Scanner;

public class Nqueen{

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int [][]a=new int[n][n];
        printN(a,"",0);
    }

    public static void printN(int[][]a, String qsf, int r) {
        if(r==a.length){
            System.out.println(qsf+".");
            return;
        }
        for(int i=0;i<a.length;i++){

            if(a[r][i]==0&&isitsafeforqueen(a, r, i)) {
                a[r][i] = 1;
                printN(a, qsf + r + "-" + i + ",", r + 1);
                a[r][i] = 0;
            }
        }
    }
    public static boolean isitsafeforqueen(int [][]a,int r,int c){

        for(int i=r-1;i>=0;i--){
            if(a[i][c]==1){
                return false;
            }
        }

        for(int i=r-1, j=c-1;i>=0&&j>=0;i--,j--){
            if(a[i][j]==1){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0&&j<a.length;i--,j++){
            if(a[i][j]==1){
                return false;
            }}
        for(int i=c-1;i>=0;i--){
            if(a[r][i]==1)
                return false;
        }

    return true;
    }

}
