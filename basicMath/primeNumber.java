import java.io.*;
import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int factors = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factors+=1;
            }
        }
        if(factors<3)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
    
}
