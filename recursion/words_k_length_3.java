import java.io.*;
import java.util.*;

public class words_k_length_3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        HashMap<Character,Integer>a=new HashMap<>();
        StringBuilder ustr=new StringBuilder();
        for(Character x : str.toCharArray()){
            if(a.containsKey(x)){
                a.put(x,a.get(x)+1);
            }
            else{
                a.put(x,1);
                ustr.append(x);
            }
        }
        sol(a,"",k,ustr+"");
    }
    public static void sol(HashMap<Character,Integer>a,String asf,int k,String ustr){
        if(asf.length()==k){
            System.out.println(asf);
            return;
        }

    }

}
