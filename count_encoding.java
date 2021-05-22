import java.io.*;
import java.util.*;

public class count_encoding{
    static String[] a = {"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws Exception {
        Scanner my=new Scanner(System.in);
        String s= my.nextLine();
        encod2(s);
    }
    public static void encod(String s){
        StringBuilder s1=new StringBuilder(s.charAt(0));
        int count=1;
        for(int i=1;i<s.length();i++){
            s1.append(s.charAt(i));
            if(s1.equals("00")){
                count=0;
            }
            else if(s1.charAt(0)=='0'&&s1.charAt(1)!='0'){
                count=count-1;
            }
            else if(s1.charAt(1)=='0'&&(s1.charAt(0)=='1'||s1.charAt(0)=='2')){
                count=count-2;
            }
          else if(s1.charAt(0)!='0'&&s1.charAt(1)!='0'){
                count++;

            }
                s1.deleteCharAt(0);
            if(Integer.parseInt(String.valueOf(s1.charAt(0)))==0){
                count--;
            }
            }
        System.out.println(count);
        }
        public static void encod2(String s){
        int dp[]=new int[s.length()];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            if(s.charAt(i-1)=='0'&&s.charAt(i)=='0'){
                dp[i]=0;
            }
            else if(s.charAt(i-1)=='0'&&s.charAt(i)!='0'){
                dp[i]=dp[i-1];
            }
            else if(s.charAt(i-1)!='0'&&s.charAt(i)=='0'){
                if(s.charAt(i-1)=='1'||s.charAt(i)=='2')
                dp[i]=(i>=2?dp[i-2]:1);
                else{
                    dp[i]=0;
                }
            }
            else{

             if(Integer.parseInt(s.substring(i-1,i+1))<=26){
                    dp[i]=dp[i-1]+(i>=2?dp[i-2]:1);
             }
             else{
                 dp[i]=dp[i-1];
             }
            }
        }
            System.out.println(dp[dp.length-1]);
        }
    }