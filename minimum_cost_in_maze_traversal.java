/*
6
0 1 4 2 8 2
4 3 6 5 0 4
1 2 4 1 4 6
2 0 7 3 2 2
3 1 5 9 2 4
2 7 0 8 5 1
 */

import java.util.*;

public class minimum_cost_in_maze_traversal {

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int m=my.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=my.nextInt();
            }
        }
        long start = System.currentTimeMillis();
//        ArrayList<Integer>f=new ArrayList<>();
//       ArrayList<Integer>x=minimum_amount(a,n-1,m-1,0,f);
//        System.out.println(x);
       minimumamount2(a);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
    public static ArrayList<Integer> minimum_amount(int [][]a,int r,int c,int n,ArrayList<Integer>f){
          if(r==0&&c==0){
              f.add(n+a[r][c]);
              if(f.size()>=2){
                  if (f.get(0) > f.get(1)) {
                      f.remove(0);
                  } else {
                      f.remove(1);
                  }
              }
              return f;
          }
            if(r>0)
              minimum_amount(a,r-1,c,n+a[r][c],f);
            if(c>0)
            minimum_amount(a,r,c-1,n+a[r][c],f);

        return f;}
    public static void minimumamount2(int [][]a){
        int [][]min=new int[a.length][a[0].length];
        for(int i=a.length-1;i>=0;i--){
            for(int j=a[0].length-1;j>=0;j--){
                if(i==a.length-1&&j==a[0].length-1){
                    min[i][j]=a[i][j];
                }
                else if(i==a.length-1){
                    min[i][j]=a[i][j]+min[i][j+1];
                }
                else if(j==a[0].length-1){
                    min[i][j]=min[i+1][j]+a[i][j];
                }
                else{
                    if(min[i][j+1]<min[i+1][j]){
                        min[i][j]=a[i][j]+min[i][j+1];
                    }
                    else {
                        min[i][j]=a[i][j]+min[i+1][j];
                    }
                }
            }
        }
        System.out.println(min[0][0]);
}
}