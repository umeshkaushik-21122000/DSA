import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.String;
 class recursion2 {
     static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        String x=(f.readLine());
        ArrayList<String>l=getKPC(x);
        System.out.println(l);
    }
    public static ArrayList<String> getKPC(String x) {
        if(x.length()==1){
            String s5=codes[Integer.parseInt(String.valueOf(x.charAt(0)))];
            ArrayList<String>g=new ArrayList<>();
            for(int i=0;i<codes[Integer.parseInt(String.valueOf(x.charAt(0)))].length();i++){
                g.add(""+s5.charAt(i));
            }
            return g;
        }
        StringBuilder t=new StringBuilder(x);
        String my=codes[Integer.parseInt(String.valueOf(t.charAt(0)))];
        t.deleteCharAt(0);
        String j=new String(t);
        ArrayList<String>g=getKPC(j);
        ArrayList<String>GG=new ArrayList<>(g);
        for(int ll=0;ll<my.length();ll++){
            char cc=my.charAt(ll);
            int fff=GG.size();
        for(int list=0;list<fff;list++){
            if(ll==0){String sss=""+cc+g.get(list);
            g.remove(list);
            g.add(list,sss);}
            else{
                String ssss=""+cc+GG.get(list);
                g.add(ssss);
            }
        }
        }
    return g;}

}
