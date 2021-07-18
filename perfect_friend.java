import javax.sound.sampled.Line;
import java.io.*;
import java.net.Inet4Address;
import java.util.*;
public class perfect_friend{
    public static class Edge{
        int v;
        int n;
        Edge(int v,int n){
            this.v=v;
            this.n=n;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        ArrayList<Edge>[]graph=new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>>comps=new ArrayList<>();
        for(int i=0;i<k;i++){
            String a=br.readLine();
            String []b=a.split(" ");
            int x=Integer.parseInt(b[0]);
            int y=Integer.parseInt(b[1]);
            graph[x].add(new Edge(x,y));
            graph[y].add(new Edge(y,x));
        }
        boolean[]visited=new boolean[n];
        int pair=0;
        for(int i=0;i<n;i++){
            ArrayList<Integer>x=new ArrayList<>();
         if(!visited[i]){
            ArrayList f= recursion(visited,graph,graph[i].get(0).v,x);
             comps.add(f);
         }
        }
        for(int i=0;i<comps.size();i++){
            for(int j=i+1;j<comps.size();j++){
                int curr=comps.get(i).size()*comps.get(j).size();
                pair+=curr;
            }
        }
        System.out.println(pair);
    }
    public static ArrayList<Integer> recursion(boolean[]visited,ArrayList<Edge>[]graph,int src,ArrayList<Integer>a){
        if(visited[src]==true){
            return null;
        }
        visited[src]=true;
        a.add(src);
        for( Edge s : graph[src]){
            recursion(visited,graph,s.n,a);
        }
  return a;

    }
}