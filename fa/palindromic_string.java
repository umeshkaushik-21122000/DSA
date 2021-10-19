import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class palindromic_string {
    public static void main(String[] args)throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String s=f.readLine();
        pallindrome(s);


    }
    public static void pallindrome(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(ispalindrome(s.substring(i,j))){
                    System.out.println(s.substring(i,j));
                }

            }

        }
    }

    public static boolean ispalindrome(String ss){

        int i=0;
        int j=ss.length()-1;
        while(j>=i){
        char ch1=ss.charAt(i);
        char ch2=ss.charAt(j);
        if(ch1!=ch2){
           return false;
        }
       else{

           i++;
        j--;

       }
        }
    return true;}

}
