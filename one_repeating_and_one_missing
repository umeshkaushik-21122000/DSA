import java.util.*;
public class Main
{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr) {
        HashSet<Integer>x=new HashSet<>();
        int rnum=0;
        for (int j : arr) {
            if (x.contains(j)) {
                rnum=j;
                break;
            }
            else {
                x.add(j);
            }
        }
        int rxor=0;
        int txor=0;
        int jj=1;
        for(int a : arr){
            rxor^=a;
            txor^=jj;
            jj++;
        }
      
        int mnum=rnum^rxor^txor;
        System.out.println("Missing Number -> "+mnum+"
"+"Repeating Number -> "+rnum);
    }

}
