public class basic01BitManupilation {

    public static void checkEvenOdd(int bitNun){
        int bitmask =1;
        if ((bitNun & bitmask)==0){
            System.out.println(bitNun+" is Even number");
        } else{
            System.out.println(bitNun+ "is Odd Number");
        }
    }
    public static void main(String[] args) {

        //Basic operator in java (Bit manupilation)

        // AND Operator 
        System.out.println(5 & 6);

        // OR Operator 
        System.out.println(5 | 6);

        // XOR Operator 
        System.out.println( 5^6);

        //Checking even or odd in bit 
        checkEvenOdd(4);
        checkEvenOdd(3);
        
    } 
}