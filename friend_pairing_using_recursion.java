import java.util.ArrayList;
import java.util.Scanner;

public class friend_pairing_using_recursion {
    public static void main(String[] args){
        Scanner my=new Scanner(System.in);
        int a=my.nextInt();
        ArrayList<ArrayList<Integer>>b=new ArrayList<>();
        boolean []used=new boolean[a+1];
        recursion(1,a,b,used);
    }
    static int counter=1;
    public static void recursion(int i,int n,ArrayList<ArrayList<Integer>>a,boolean[]used){
        if(i>n){
            System.out.println(counter+"."+a);
            counter++;
        return;
        }
        if(used[i]){
            recursion(i+1,n,a,used);
        }
        else{
            ArrayList<Integer> b = new ArrayList<>();
            used[i] = true;
            b.add(i);
            a.add(b);
            recursion(i + 1, n, a, used);
            a.remove(b);
            for (int j = i + 1; j <= n; j++) {
                if (!used[j]) {
                    used[j] = true;
                    b.add(j);
                    a.add(b);
                    recursion(i + 1, n, a, used);
                    used[j]=false;
                    a.remove(b);
                    b.remove(b.size() - 1);
                }
            }
        used[i]=false;
    }
}
}
