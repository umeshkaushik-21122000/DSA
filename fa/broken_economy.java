import java.util.Arrays;
import java.util.Scanner;
public class broken_economy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int[] b =new int[a];
        for(int i=0;i<b.length;i++){

            b[i]=scanner.nextInt();
        }
        int number=scanner.nextInt();
        Arrays.sort(b);
        int m=getvalue(b,number);
        System.out.println(b[m+1]+"\n"+b[m]);


    }
    public static int  getvalue(int []a, int number){
        int l=0,h=a.length-1,t=0,m=1;
        for(int i=0;i<a.length;i++){
            if(h>l){
         m=((l+h)/2);
            }
          if(a[m]>number){
              h=m;
             // System.out.println(l+"    1");
              //System.out.println(m+"     1");
              //System.out.println(h+"     1");
          }
          else {
              l=m;
              /*System.out.println(l+"     2");
              System.out.println(m+"      2");
              System.out.println(h+"      2");*/
          }

           }

    return m;}

}
