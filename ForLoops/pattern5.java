package ForLoops;

public class pattern5 {
    public static void main(String[] args) {
        int N=3;
        // for(int i=0;i<N;i++){
        //     for(int j=N;j>i;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int i=N;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
