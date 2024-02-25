public class divisors {
    public static void main(String[] args) {
        int n = 10;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
