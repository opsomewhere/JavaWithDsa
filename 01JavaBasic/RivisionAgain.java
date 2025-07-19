import java.util.Arrays;

public class RivisionAgain {
    // where did i mistake
    // n-1-i is the mirror position of i
    // in if stat - stament should retuen false
    public static boolean isPalindrome(String name) {
        int n = name.length();

        for (int i = 0; i < name.length() / 2; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static int[] revOfArray(int arr[]) {
        int n = arr.length;
        int revarr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            revarr[i] = arr[n - 1 - i];
        }

        return revarr;
    }

    public static void main(String[] args) {
        // Type casting - two types
        // chote se bare - auto matic
        // bare to chote - manually

        // byte -> short -> int -> float -> double == automatic
        int num1 = 10;
        float num2 = num1;
        System.out.println(num2);

        // manually ( big to small )
        float numFloat = 10.34f;
        int numInt = (int) numFloat;
        System.out.println(numInt);

        // check if string is palindrome
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false

        // reversed of an array
        int[] original = { 1, 2, 3, 4, 5 };
        int[] reversed = revOfArray(original);
        System.out.println(Arrays.toString(reversed));

        

    }
}
