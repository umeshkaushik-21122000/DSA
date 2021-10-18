import java.util.Scanner;

public class primefactor{
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        for(int i=2;i<=a;i++){
            while(a%i==0){
                System.out.print(i);
                a=a/i;

            }


        }
    }
}
