import java.util.Scanner;
public class max_score{
    public static int solution(String[] words, int[] farr, int[] score, int idx) {
       if(idx== words.length){
           return 0;
       }
        int otherscore=solution(words,farr,score,idx+1);
         String a=words[idx];
        int myscore=0;
        boolean k=true;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(farr[c-'a']==0){
                k=false;
            }
            farr[c-'a']--;
           myscore+=score[c-'a'];
        }
        if(k){
        myscore+=solution(words,farr,score,idx+1);
        }
        else{
            myscore=0;
        }
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            farr[c-'a']++;
        }
        return Math.max(myscore,otherscore);
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int nofWords = scn.nextInt();
        String[] words = new String[nofWords];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }
        int nofLetters = scn.nextInt();
        char[] letters = new char[nofLetters];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scn.next().charAt(0);
        }
        int[] score = new int[26];
        for (int i = 0; i < score.length; i++) {
            score[i] = scn.nextInt();
        }
        if (words.length == 0 || letters.length == 0) {
            System.out.println(0);
            return;
        }
        int[] farr = new int[score.length];
        for (char ch : letters) {
            farr[ch - 'a']++;
        }
           System.out.println(solution(words, farr, score, 0));

        }
}
