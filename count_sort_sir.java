import java.util.*;
/*
15
9
6
3
5
3
4
3
9
6
4
6
5
8
9
9
*/
public class count_sort_sir{
    public static void countSort(int[] a, int min, int max) {
        int range=max-min+1;
        int []f=new int[range];
        int []ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            f[a[i]-min]++;
        }
        for(int i=1;i<f.length;i++){
            f[i]=f[i]+f[i-1];
        }
        for(int i=a.length-1;i>=0;i--){
            int idx=a[i]-min;
            int pos=f[idx];
            int j=pos-1;
            ans[j]=a[i];
            f[idx]--;

        }
        print(ans); }
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
    }

}