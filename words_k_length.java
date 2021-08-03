import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class words_k_length{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.contains(ch) == false) {
                unique.add(ch);
                ustr += ch;
            }
        }

        sol1(new Character[k],0,ustr);
    }
    public static void sol1(Character []arr,int idx,String ustr){
        if(idx==arr.length){
            for( Character a : arr){
                System.out.print(a);
            }
            System.out.println();
            return;
        }
        for(int i=0;i<ustr.length();i++){
            StringBuilder str=new StringBuilder(ustr);
            arr[idx]=ustr.charAt(i);
            str.deleteCharAt(i);
            sol1(arr,idx+1,str+"");
        }
    }

}