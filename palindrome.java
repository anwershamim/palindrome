public class palindrome {
    public static void main(String [] args){
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(123));

    }
    public static boolean isPalindrome(int number){
    //    int result = 0;
      //  int remainder;
       // while(number!=0){
         //   remainder = number%10;
           // number /= 10;
            //result = (result*10) + remainder;
        //}
        //return result;
        int reverse = number;
        int result = 0;
        while(number !=0){
            int lastDigit = number %10;
            result = (result *10) + lastDigit;
            number /= 10;
        }
        return reverse == result;
    }
}
