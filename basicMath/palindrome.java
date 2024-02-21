package basicMath;

public class palindrome {
    public void palindrome_reverse(int n)
    {
        int num = n;
        int reverse = 0;
        while(num!=0)
        {
           int digit = num % 10;
           reverse = reverse*10+digit;
           num = num/10;
        }
        if(reverse == n)
        {
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
        
    }

    //method -2
    public void reverse(String n)
    {
        String num = n;
        int b = num.length();
        String c = "";
        for(int i = 1;i<=b;i++)
        {
            c = c + num.charAt(b-i);
        }
        if(c.equals(num))
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome g = new palindrome();
        g.reverse("121");
        g.palindrome_reverse(121);

    }
    
}
