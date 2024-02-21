package basicMath;

public class gcdHcf {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;   
        }
        if(a==0)
        {
            return b;
        }
        else{
            return gcd(b, a%b);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(3,6));
    }
}