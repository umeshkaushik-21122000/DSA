import java.io.*;
import java.util.*;
public class words_k_selection3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashMap<Character, Integer> unique = new HashMap<>();
        StringBuilder ustr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!unique.containsKey(ch)){
                unique.put(ch, 1);
                ustr.append(ch);
            } else {
                unique.put(ch, unique.get(ch) + 1);
            }
        }
        sol(unique,"",ustr+"",k,0);
    }
    public static void sol(HashMap<Character,Integer>unique,String asf,String ustr,int ts,int cc){
        if(cc>=ustr.length()){
                if(asf.length()==ts)
                System.out.println(asf);
            return;
        }
        char c=ustr.charAt(cc);
        int maxtime=unique.get(c);
        for(int i=maxtime;i>=0;i--){
            String s=new String();
            for(int j=0;j<i;j++){
                s+=c;
            }
            sol(unique,asf+s,ustr,ts,cc+1);
        }
    }
}
