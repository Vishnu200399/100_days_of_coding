package basicMath;

public class reverseNumber {

  
    public void ReverseNumber(int N)
    {
        int num = N;
        int reverse = 0;
        while(N!=0)
        {
            int digit = N % 10;
            reverse = reverse*10+digit;
            N = N/10;
        }
        
        if(num == reverse){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        // return reverse;
        
    }
    public static void main(String[] args) {
        reverseNumber obj = new reverseNumber();
        obj.ReverseNumber(1213);
        // System.out.println("The reverse of the:");
      }

   
}
