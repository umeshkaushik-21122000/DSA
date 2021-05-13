import java.io.BufferedReader;
import java.io.InputStreamReader;
public class printsubsequence2{

    public static void main(String[] args) throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String str=f.readLine();
        printSS(str,"");
    }
    public static void printSS(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        str=str.substring(1);
        printSS(str,ans+ch);
        printSS(str,ans+"");
    }
}