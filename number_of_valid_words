import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < words.length; i++){
            words[i] = scn.next();
        }
        int m = scn.nextInt();
        String[] puzzles = new String[m];
        for(int i = 0 ; i < m ;i++) {
            puzzles[i] = scn.next();
        }
       ArrayList<Integer>a= solution2(words,puzzles);
        int i=0;
        for(String s : puzzles){
            System.out.println(s+" -> "+a.get(i));
        i++;
        }
    }
    public static ArrayList<Integer> solution2(String []words,String []puzzles){
        HashMap<Integer,ArrayList<Integer>>brow=new HashMap<>();
        for(int i=0;i<26;i++){
            brow.put(i,new ArrayList<>());
        }
        for(String s : words){
                char c =s.charAt(0);
                ArrayList<Integer>hh=brow.get(c-'a');
                int num=0;
                for(char cc : s.toCharArray()){
                    num=num|(1<<cc-'a');
                }
                hh.add(num);
        }
        ArrayList<Integer>mal=new ArrayList<>();
        for (String s : puzzles) {
            int mask = 1 << s.charAt(0) - 'a';
            int number = 0;
            int count = 0;
            for (char c : s.toCharArray()){
                int pos = c - 'a';
                number = number | (1<<pos);
            }
            StringBuilder ssss=new StringBuilder();
            int nc=number;
            while(nc>0){
                int rsb=nc&-nc;
                int lo=(int)(Math.log(rsb)/Math.log(2));
                int c='a'+lo;
                char ch=(char)c;
                ssss.append(ch);
                nc-=rsb;
            }
            String sss=ssss+"";
            for (char c : sss.toCharArray()) {
                ArrayList<Integer> hh = brow.get(c - 'a');
                for (int a : hh) {
                    if ((a & number) == a && (mask & a) != 0) {
                        count++;
                    }
                }
            }
            mal.add(count);
        }
  return mal;
    }
}
