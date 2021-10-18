import java.util.Scanner;
/*
4
-2
5
9
11
3
4
6
8
 */

public class merge_two_sorted_array{
    public static boolean isSmaller(int[] a,int i,int []b , int j) {
        System.out.println("comparing "+a[i]+" with "+b[j]);
        if(a[i]<b[j]){
            return true;
        }
        else{
        return false;
        }
    }

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int []c=new int[a.length+b.length];

        int cp=0;
        int bp=0;
        int ap=0;
        while(cp!=c.length){

            if(isSmaller(a,ap,b,bp)){
             c[cp]=a[ap];
             ap++;
             cp++;
                if(ap==a.length){
                    break;
                }
            }
            else{
                c[cp]=b[bp];
                cp++;
                bp++;
                if(bp==b.length){
                    break;
                }
            }
        }
        while(bp!=b.length){
            c[cp]=b[bp];
            bp++;
            cp++;
        }
        while(ap!=a.length){
            c[cp]=a[ap];
            cp++;
            ap++;
        }

        return c;
    }

    public static void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }

}
