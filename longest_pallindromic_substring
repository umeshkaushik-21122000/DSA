import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner m=new Scanner(System.in);
        String s=m.nextLine();
        boolean [][]dp=new boolean[s.length()][s.length()];
        int length=0;
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;i<s.length()&&j<s.length();i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }
                else{
                    boolean k=s.charAt(i)==s.charAt(j);
                    if(g==1){
                        if(k)
                        {
                            dp[i][j]=true;
                            
                        }

                        else dp[i][j]=false;
                    }
                    else{
                        if(k){
                            dp[i][j]= dp[i + 1][j - 1];
                        }
                        else dp[i][j]=false;
                    }
                }
            }
        }
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;i<s.length()&&j<s.length();i++,j++){
                if(dp[i][j]){
                    length=g+1;
                }
            }
        }
        System.out.println(length);
    }

}
