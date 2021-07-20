import java.util.*;
/*
Input:
n = 5 k = 3
Output: 4
Explanation: There are 5 persons so
skipping 2 person i.e 3rd person will
be killed. Thus the safe position is 4.
 */
public class josephus_case_normal {
        static int ans=1;
    public static void solution(int n,int k,int start,int rem,int val){
            if(rem==1){
                ans=(val);
                return ;
            }
            else{
                System.out.println(start);
                        if(start>=n){
                            start=start%n;
                            k=2*k;
                            solution(n,k,(start+k+1),rem-1,val-(start+k));
                        }
                        else{
                    solution(n,k,(start+k+1),rem-1,val-(start+k));
            }
            }
    }
    public static void main(String[]args){
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        int k=my.nextInt();
        int val=(n*(n+1))/2;
        k--;
        solution(n,k,1,n,val);
        System.out.println(ans);

    }
}
