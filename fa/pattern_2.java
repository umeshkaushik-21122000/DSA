import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt(), k = a - 1, l;
        for (int i = 1; i <= a; i++) {
            for (; k > 0; k--) {
                System.out.print("\t");
            }
            k = a - i - 1;
            l = a - k;
            for (int j = 1; j < l; j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }


    }
}
