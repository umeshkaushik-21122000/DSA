import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        String s=my.nextLine();
        Stack<Character>f=new Stack<>();

        for(int i=0;i<s.length();i++){
            boolean g=false;
            char ch=s.charAt(i);
              if(ch=='}'||ch==']'||ch==')'){
                  int l=ch-2;
                  if(ch==')'){
                      l=ch-1;
                  }
                  if(f.size()!=0&&f.peek()==(char)l){
                f.pop();
                  }
                  else{
                      f.push(ch);
                  }
              }
              else if(ch=='{'||ch=='['||ch=='('){
                  f.push(ch);
              }
        }
        if(f.size()==0){
        System.out.println("true");}
        else{
            System.out.println("false");
        }
    }
}
