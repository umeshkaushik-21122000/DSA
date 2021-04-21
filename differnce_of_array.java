import java.util.Scanner;

public class differnce_of_array {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int n1=my.nextInt();
        int []a=new int[n1];
                                for(int i=0;i<a.length;i++){
            a[i]=my.nextInt();
        }
        int n2=my.nextInt();
        int []b=new int[n2];
                                    for(int i=0;i<b.length;i++){
            b[i]=my.nextInt();
        }
        int t=n2-1,carry=0;
        int l=n1-1;
        int []result=new int[n2];
        for(int i=l;i>=0;i--){
           if(b[t]>=a[l]){
               result[t]=b[t]-a[l];
           }
           else{
               b[t-1]=b[t-1]-1;
               carry=10;
               result[t]=b[t]+carry-a[l];

           }

            t--;l--;

            }
        while(t!=-1){

            result[t]=b[t];
            t--;
        }

            for(int i=0;i<n2;i++){
                System.out.println(result[i]);
            }
        }

    }

