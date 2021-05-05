import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recursion2 {
    public static void main(String[] args)throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(f.readLine());

recursion(n);

    }

    public static int recursion(int n){
        if(n==0){
            return 1;
        }
        recursion(n-1);
        System.out.println(n);
    return 1;}

}
