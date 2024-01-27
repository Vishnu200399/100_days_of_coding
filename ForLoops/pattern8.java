import java.util.Scanner;

public class pattern8 {
    static void lowerPyramid(int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*N-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        } 
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    lowerPyramid(N);
  
 }
}