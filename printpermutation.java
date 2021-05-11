import java.io.*;
import java.util.*;

public class printpermutation{

    public static void main(String[] args) throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String str=f.readLine();
        printPermutations(str,"");

    }

    public static void printPermutations(String str,String ans) {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        StringBuilder strr=new StringBuilder(str);
        strr.deleteCharAt(i);
        String rr=new String(strr);
        printPermutations(rr,ans+ch);
       }
    }

}