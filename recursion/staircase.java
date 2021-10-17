import java.io.*;
import java.lang.*;
import java.util.*;
public class staircase{

    public static void main(String[] args) throws Exception{
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(f.readLine());
        ArrayList<String>g=staircase(n);
        System.out.println(g);
    }
    public static ArrayList<String>staircase(int n){
    if(n==1){
     ArrayList<String>k=new ArrayList<>();
    k.add("1");
   return k; }
        if(n==0){
            ArrayList<String>k=new ArrayList<>();
                k.add("");
     return k;   }
        if(n==-1){
            return new ArrayList<>();}
        ArrayList<String>s1=staircase(n-1);
        ArrayList<String>s2=staircase(n-2);
        ArrayList<String>s3=staircase(n-3);
        ArrayList<String >s4=new ArrayList<>();
        for(String mypath:s1){
            s4.add("1"+mypath);
        }
        for(String mypath:s2){
            s4.add("2"+mypath);
        }
        for(String mypath:s3){
            s4.add("3"+mypath);
        }
   return s4; }

}
