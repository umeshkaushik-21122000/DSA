import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
            Scanner sc=new Scanner(System.in);
            int t= sc.nextInt();
            while (t-->0){
                int N= sc.nextInt();
                String s1= sc.nextLine();
                String s= sc.nextLine();
                int ans=0;
                for(int i=0;i<N;i++){
                    for(int j=i+1;j<N && j<i+1+9;j++){
                        if((j-i)==Math.abs((int)s.charAt(i)-(int)s.charAt(j))){
                            ans++;
                        }
                    }
                }
                System.out.println(ans);
            }
        }
        catch (Exception e){
            return;
        }
	}
}
