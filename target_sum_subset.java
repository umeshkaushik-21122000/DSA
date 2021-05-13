import java.util.Scanner;

public class target_sum_subset {

    public static void main(String[] args) throws Exception {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = my.nextInt();
        }
        int tar=my.nextInt();
        printtss(a,0,"",0,tar);
    }

    public static void printtss(int[] a, int idx, String set, int sos, int tar) {
        if(sos==tar){
            String z = "";
            for(int i=idx;i<a.length;i++){
                if(a[i]==0){
                    z=z+"0, ";
                    System.out.println(set+z+".");
                }
            }
            System.out.println(set+".");
            return;
        }
        for(int j=idx;j<a.length;j++)
        {
            printtss(a,j+1,set+a[j]+",",sos+a[j],tar);
        }
    }
}