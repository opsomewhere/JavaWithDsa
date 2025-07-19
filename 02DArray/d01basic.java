import java.util.*;
public class d01basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][]=new int[3][3];

        // For taking input 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //  For Printing 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



        

        sc.close();
    }
}
