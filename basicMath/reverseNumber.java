package basicMath;

public class reverseNumber {

  
    public static int ReverseNumber(int N)
    {
        int num = N;
        int reverse = 0;
        while(N!=0)
        {
            int digit = N % 10;
            reverse = reverse*10+digit;
            N = N/10;
        }
        return reverse;
        
    }
    public static void main(String[] args) {
        System.out.println("The reverse of the:"+ReverseNumber(123));
      }
   
}
