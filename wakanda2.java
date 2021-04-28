import java.io.BufferedReader;
import java.io.InputStreamReader;

public class wakanda2 {

    public static void main(String[] args) throws Exception{
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(f.readLine());
        int [][]a=new int[x][x];
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                a[i][j]=Integer.parseInt(f.readLine());
            }
        }
        int starter=0,starter2=0;
        for(int k=0;k<x;k++){
        for(int i=0;i<x;i++){
            for(int j=starter2;j<x;j++){
                if((i+starter)==j){
                    System.out.println(a[i][j]);

                }

            }
        }
        starter2++;starter++;
        }
    }
}
