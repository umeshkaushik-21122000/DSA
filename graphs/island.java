import java.io.*;
public class island{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }
        int count=0;
        boolean [][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    if(visited[i][j]==false){
                        recursion(arr,visited,i,j);
                            count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void recursion(int [][]arr,boolean [][]visited,int i,int j){
        if(j==arr[0].length||i==arr.length||i<0||j<0||arr[i][j]==1||visited[i][j]==true){
            return;
        }
            visited[i][j]=true;
            recursion(arr,visited,i-1,j);
            recursion(arr,visited,i+1,j);
            recursion(arr,visited,i,j+1);
            recursion(arr,visited,i,j-1);
    }
}
