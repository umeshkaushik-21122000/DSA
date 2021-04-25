import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int i=1,x=my.nextInt();
        while(i<=x) {


            int n;
            {
                int a = my.nextInt();
                while (a != 0) {
                    n = a % 10;
                    System.out.print(n);
                    a = a / 10;
                }
                System.out.print("\n");
            }
       i++;


        }
    }
}
