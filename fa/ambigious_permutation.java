import java.util.Arrays;
import java.util.Scanner;

public class ambigious_permutation {


    public static void main(String[] args) {
      Scanner my=new Scanner(System.in);
     int input=my.nextInt();
     int []a=new int[input];
     for(int i=0;i<input;i++){
        a[i]=my.nextInt();
     }
     boolean t=true;
        Arrays.sort(a);
     for(int i=0;i<a.length;i++){
            if(a[i]==i+1){
                t=false;

            }
            else{
               break;
            }
        }
     if(t){
         System.out.println("not ambiguous");
     }
     else{
         System.out.println("ambiguous");
     }
    }
}
