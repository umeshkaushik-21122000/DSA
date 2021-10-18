import java.util.Scanner;

public class inverse_of_an_array{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int x=my.nextInt();
        int [] a=new int[x];
        for(int i=0;i<x;i++){
            a[i]=my.nextInt();
        }
        int [] b=new int[x];
        for(int i=0;i<x;i++){
            int face=a[i];
            b[face]=i;
        }

        for(int i=0;i<x;i++){
            System.out.println(b[i]);
        }

    }
}
