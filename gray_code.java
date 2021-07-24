import java.util.*;

public class gray_code{

    public static List<Integer> grayCode(int n) {
        int number=0;
        n--;
        while(n!=-1){
        number=number|1<<n;
        n--;
        }
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<=number;i++){
            a.add(i);
        }
        return a;}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> ans=grayCode(scn.nextInt());

        System.out.println(ans);
    }
}