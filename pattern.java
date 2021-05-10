import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k=1;
        for(int line=1;line<=n;line++){
            for(int j=1;j<=n;j++){
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
           if(line<=n/2&&n%2!=0){
            k=k+n;
           }
           else if(line<=(n/2)-1&&n%2==0){
            k=k+n;
           }
           else if(n%2==0&&line==n/2){

           }
           else if(n%2!=0&&line==(n/2)+1){
                k=k-2*n;
           }
           else{
               k=k-3*n;
           }
        }
    }
}