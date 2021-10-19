import java.util.Arrays;
import java.util.Scanner;

public class dp_suspected_elements {
    public static void main(String [] args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        for(int x=1;x<=n;x++){
            int a=my.nextInt();
            int []a1=new int[a];
            int sum=0;
            for(int i=0;i<a;i++){
                a1[i]=my.nextInt();
                sum+=a1[i];
            }
            int t=(a*(a+1))/2;
            int number=t-sum;
            Arrays.sort(a1);
            System.out.println(a1[a-number]);
        }
    }
}
