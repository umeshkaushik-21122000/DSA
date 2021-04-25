import java.util.Scanner;

public class sortingarray {

    public static void main(String [] args){
     Scanner scanner=new Scanner(System.in);           //creating a scanner object and assigning the memory into heap and taking the input user w
                                                    //which user will pass in the console
     int x=scanner.nextInt();                         //scanning the character in the console and then converting into int type
      int [] a=new int[x];                            //declaring an array and assigning it memory in the heap whose length =x;
        for( int i=0;i<x;i++){
            a[i]=scanner.nextInt();

        }
        for(int i=0;i<x;i++){

            a[i]=sort(a[i],a[(i+1)==x?(i):(i+1)]);

        }
        for(int i=0;i<x;i++){
            System.out.println(a[i]);
        }

    }
    public static int sort(int a,int b){
        return Math.min(a,b); }
}
