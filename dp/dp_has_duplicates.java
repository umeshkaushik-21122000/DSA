import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dp_has_duplicates {
    public static void main(String[] args) throws Exception{
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(f.readLine());
        int x=1;
        for( ;x<=n;x++){
            boolean t=false;
            int a=Integer.parseInt(f.readLine());
            int []a1=new int[a];
            String s1=f.readLine();
            String []s=s1.split(" ");
            for(int i=0;i<a;i++){
                a1[i]=Integer.parseInt(s[i]);
                if(i>0){
                    for(int j=0;j<i;j++){
                        if(a1[j]==a1[i]){
                            System.out.println("true");
                            t=true;
                            break;
                        }
                    }
                }
                if(t){
                    break;
                }
            }
            if(!t){
                System.out.println("false");
            }

        }
    }
}
