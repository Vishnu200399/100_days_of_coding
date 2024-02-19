package basicMath;

public class countDigits {
    public static int count_Digits(int n){
    // method1
    //     int x = n; 
    //     int count =0;
    //     while( x!=0 ) 
    //    {
    //        x = x / 10;
    //        count++;
    //    }
    //     return count;
    //method 2
    // String num = Integer.toString(n);
    // return num.length();
    //method3
    int num = (int)Math.floor(Math.log10(n)+1);
    return num;
    }
    public static void main(String[] args) {
           int n = 12345;
           System.out.println("Number of digits in " + n + " is: "+count_Digits(n));
    }
}
