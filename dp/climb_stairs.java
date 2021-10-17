import java.io.*;
public class climb_stairs {

    public static void main(String[] args) throws Exception {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(f.readLine());
        int []a=new int[3];
        int count=countpaths(x);
        System.out.println(count);
    }
public static int countstairs(int x,int []count){
        if(x==0)
        {
            return 1;
        }
    if(x<0)
    {
        return 0;
    }
    if(count[x]!=0){
        return x;
    }
       int count1=countstairs(x-1,count);
       int count2=countstairs(x-2,count);
       int count3=countstairs(x-3,count);
       count[0]=count1+count2+count3;
       count[1]=count2;
       count[2]=count3;
return count[x];}
    public static int  countpaths(int x){
        int []a=new int[x+1];
        a[0]=1;
        for(int i=1;i<=x;i++){
            if(i==1){
                a[i]=a[i]+a[i-1];
            }
            else if(i==2){
                a[i]=a[i-1]+a[i-2];
            }
            else{
            a[i]=a[i-1]+a[i-2]+a[i-3];
            }
        }

    return a[x];}

}
