import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recursion {
    public static void main(String[] args)throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(f.readLine());
            recursive(n);

    }
    public static int recursive(int n){

        System.out.println(n);
        n=n-1;
        if(n==0){
            return 1;
        }
    return recursive(n);
    }
}
