package ForLoops;

public class pattern6 {
    public static void main(String[] args) {
        int N=3;
        for(int i=0;i<N;i++){
            for(int j=N;j>i;j--){
                System.out.print(j+"");
            }
            System.out.println();
        }        
    }
    
}
