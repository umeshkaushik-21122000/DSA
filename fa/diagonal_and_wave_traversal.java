import java.util.Scanner;

public class diagonal_and_wave_traversal {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int n= my.nextInt();
        int [][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             a[i][j]=my.nextInt();
            }
        }
        for(int i=1;i<n+1;i++){
            if(i%2==0){
                for(int line=n-1;line>=0;line--){
                    for(int coloumn=0;coloumn<n;coloumn++){
                        if(line-coloumn==(n-i)){
                            System.out.println(a[line][coloumn]);
                        }
                    }
                }

            }
            else{
                for(int line=0;line<n;line++){
                    for(int coloumn=0;coloumn<n;coloumn++){
                        if(line-coloumn==(n-i)){
                            System.out.println(a[line][coloumn]);
                        }
                    }
                }

            }

        }

        for(int i=n-1;i>=1;i--){
            if(i%2==0){
                for(int line=n-1;line>=0;line--){
                    for(int coloumn=0;coloumn<n;coloumn++){
                        if(coloumn-line==(n-i)){
                            System.out.println(a[line][coloumn]);
                        }
                    }
                }
            }
            else{
            for(int line=0;line<n;line++){
                for(int coloumn=0;coloumn<n;coloumn++){
                    if(coloumn-line==(n-i)){
                        System.out.println(a[line][coloumn]);
                    }
                }
            }
            }
        }


            }
        }


