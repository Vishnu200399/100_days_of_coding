package basicMath;

public class gcdHcf {
    //method -1
   public static int gcd(int a,int b)
   {
    int ans = 1;
    for(int i=1;i<=Math.min(a,b);i++)
    {
        if(a%i==0 && b%i==0)
        {
            ans = i;
        }
    }
    return ans;
   }

   //method -2
    // public static int gcd(int a,int b)
    // {
    //     if(b==0)
    //     {
    //         return a;   
    //     }
    //     if(a==0)
    //     {
    //         return b;
    //     }
    //     else{
    //         return gcd(b, a%b);
    //     }
    // }
    
    public static void main(String[] args) {
        System.out.println(gcd(3,6));
    }
}