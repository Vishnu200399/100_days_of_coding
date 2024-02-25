// package basicMath;
public class amstrongNumber {
      public void number(int N)
      {
        int n = N;
        int sum = 0;
        while(n > 0)
        {
          int rem = n % 10;//3//5//1
          sum += rem * rem * rem;//27//27+125=152//152+1 = 153
          n = n / 10;//15//1
        }  
        
        if(sum == N)
        {
          System.out.println("Amstrong Number");
        }
        else
        {
          System.out.println("Not Amstrong Number");
        }
      }
      public static void main(String[] args) {
       amstrongNumber a = new amstrongNumber();
       a.number(1634);
      }
    
}
