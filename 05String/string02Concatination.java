public class string02Concatination {

    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static boolean palindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int last = str.length()-1-i;
            if (str.charAt(i) != str.charAt(last)){
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        
        //Concatination in java 
        String firstName = "Om";
        String lastName = "Prakash";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //To find alphabets in words(string) -- .chatAt() function
        printLetters(fullName);
        System.out.println(palindrome("racecar"));
    }
}
