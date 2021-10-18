import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int x=my.nextInt();
        int y=my.nextInt();
        int [][]a=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j]= my.nextInt();
            }
        }
        for(int j=0;j<y;j++){
            if(j%2==0){
            for(int i=0;i<x;i++){
                System.out.println(a[i][j]);
            }}
            else{
            for(int i=x-1;i>=0;i--){
                System.out.println(a[i][j]);
            }
            }
        }
    }
}
