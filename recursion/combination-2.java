import java.io.*;
public class Main{
    public static void combinations(int[] boxes, int ci, int ti, int lb){
        if(ci>=boxes.length){
            if(lb==ti){
            for(int a : boxes){
                if (a == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("i");
                }
            }
            System.out.println();
            }
            return;
        }
            if(lb==ti){
                combinations(boxes,ci+1,ti,lb);
            }
            else{
        for(int i=ci-1;i<boxes.length;i++){
                if(boxes[i]==0){
               boxes[i]=1;
               combinations(boxes,i+1,ti,lb+1);
               boxes[i]=0;
                }

            }
            }
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(new int[nboxes], 1, ritems, 0);

    }

}
