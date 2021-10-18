import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        ArrayList<Integer> f1 = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        int a = x.nextInt();
        for (int i = 0; i < a; i++) {
            f.add(x.nextInt());
        }
        int i = 0;
        int count = 0;
        for (int l1 = 0; l1 <f.size(); l1++) {
            for (int j = 2; j * j <=f.get(i); j++) {

                if (f.get(i) % j == 0) {
                    f1.add(f.get(i));
                    count++;
                    break;
                }

            }
            i++;
            count=0;
        }
        System.out.println(f1);
    }


}
