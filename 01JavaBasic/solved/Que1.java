package solved;

public class Que1 {

    public static boolean istrue(String word){
        String ch = word.toLowerCase();
        if (word.length()<3) {
            return false;
        }

        boolean hasVowel = false;
        boolean hasConstant = false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    hasVowel = true;
                } else{
                    hasConstant = true;
                }
            }
        }
        return hasConstant && hasVowel;
    }

    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void giveTarget(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]+arr[i+1]== target) {
                System.out.println(arr[i]+","+arr[i+1]);
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={ 2,3,4,5,6};
        int target = 9;
        giveTarget(arr, target);

        String name = "Om Prakash";
        System.out.println(istrue("a1b"));
    }
}
