public class ques {
    public static void main(String[] args) {
        String name= "Hello";
        int j = name.length()-1;
        for (int i = j; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}
