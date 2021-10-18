import java.util.Scanner;

public class grading_system {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        int a = my.nextInt();
        if(a>90){
            System.out.println("excellent");}
         if(a>80&&a<=90){
            System.out.println("good");
        }
         if(a>70&&a<=80){
            System.out.println("meets expectations");

        }

        if(a>60&&a<=70){
            System.out.println("below par");
        }
         if(a<60)
            System.out.println("poor");

    }
}
