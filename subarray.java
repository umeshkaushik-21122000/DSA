import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int x=my.nextInt();
        int [] a=new int[x];
        for(int i=0;i<x;i++){
            a[i]=my.nextInt();
        }
        int t=0,i=0;
        while(x!=0){
        for(int line=1;line<=x;line++){
            for(;i<line;i++){
                System.out.print(a[i+t]+"\t");
            }
            i=0;
            System.out.println();
        }
        t++;
        x--;
        }

    }
}
