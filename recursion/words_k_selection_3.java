import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
public class words_k_selection_3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());
        HashMap<Character, Integer> unique = new HashMap<>();
        StringBuilder ustr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!unique.containsKey(ch)) {
                unique.put(ch, 1);
                ustr.append(ch);
            } else {
                unique.put(ch, unique.get(ch) + 1);
            }
        }
        solution(unique,"",k);
    }
    public static void solution(HashMap<Character,Integer>a,String asf,int k){
        if(asf.length()==k){
            System.out.println(asf);
        }
        else{
            for( Character aa : a.keySet()){
                    if(a.size()>0){
                        if(a.get(aa)==0){
                            a.remove(aa);
                        }
                        else{
                    a.put(aa,a.get(aa)-1);
                    solution(a,asf+aa,k);

                        }
                    }
            }
        }
    }
}
