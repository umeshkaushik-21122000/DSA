import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String_with_difference_of_every_two_consecative_character {
    public static void main(String[] args) throws Exception{
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        String s=f.readLine();
        returnstring(s);

    }

    public static void returnstring(String s){
        int l=0;
        int h=1;
        int diff;
        while(h<=s.length()) {
            int ch1 = s.charAt(l);
            int ch2 = s.charAt(h);
            char c = s.charAt(l);
                    diff = ch2 - ch1;
            System.out.print(""+c+diff+(h==s.length()-1?s.charAt(h):""));
            l++;
            h++;
            if(h==s.length()){
                break;
            }
        }

    }
}
