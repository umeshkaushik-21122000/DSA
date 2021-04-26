import java.io.BufferedReader;
import java.io.InputStreamReader;

public class matrix_multiplication  {
    public static void main(String[] args) throws Exception{
        BufferedReader my=new BufferedReader(new InputStreamReader(System.in));
        int a1=Integer.parseInt(my.readLine());
        int a2=Integer.parseInt(my.readLine());
        int [][]a=new int[a1][a2];
        for(int i=0;i<a1;i++){
            for(int j=0;j<a2;j++){
                a[i][j]=Integer.parseInt(my.readLine());
            }
        }
       int a3=Integer.parseInt(my.readLine());
       int a4=Integer.parseInt(my.readLine());
       int [][]b=new int[a3][a4];
        for(int i=0;i<a3;i++){
            for(int j=0;j<a4;j++){
                b[i][j]=Integer.parseInt(my.readLine());
            }
        }
        if(a2==a3){
        int [][]mult=new int[a1][a4];
        int t=0;
        for(int i=0;i<a1;i++){
            for(int j=0;j<a4;j++){
                for(int k=0;k<a2;k++){
                    t=t+(a[i][k]*b[k][j]);
                }
                mult[i][j]=t;
                t=0;
            }
        }
            for (int i=0;i< mult.length;i++) {
            for (int j = 0; j < mult[0].length; j++) {
                System.out.print(mult[i][j]+"\t");
            }
            System.out.println();
        }
        }
        else{
                System.out.println("invalid input");
            }
    }

    }

