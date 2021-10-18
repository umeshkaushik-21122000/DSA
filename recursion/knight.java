import java.io.*;
import java.util.*;

public class knight {

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int r=my.nextInt();
        int c=my.nextInt();
        int [][]a=new int[n][n];
        pkt(a,r,c,1);
    }

    public static void pkt(int[][] a, int r, int c, int u) {
        if(r<0||c<0||r>a.length-1||c>a.length-1||a[r][c]!=0){
            return;
        }
        if(u==(a.length*a.length)){
            a[r][c]=u;
            displayBoard(a);
            a[r][c]=0;
            return;
        }
        a[r][c]=u;
        pkt(a,r-2,c+1,u+1);
        pkt(a,r-1,c+2,u+1);
        pkt(a,r+1,c+2,u+1);
        pkt(a,r+2,c+1,u+1);
        pkt(a,r+2,c-1,u+1);
        pkt(a,r+1,c-2,u+1);
        pkt(a,r-1,c-2,u+1);
        pkt(a,r-2,c-1,u+1);
        a[r][c]=0;

    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
