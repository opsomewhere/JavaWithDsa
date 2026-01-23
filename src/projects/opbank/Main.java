package projects.opbank;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isCusOrAgnt;
        int isNewOrOldCus;
        int isNewOrOldAgnt;
        System.out.println("==== Welcome to OP Bank ====== ");

        System.out.println(" PLESE SEELCT AN OPTION\n1 - Customer\n2 - Agent\n");
        isCusOrAgnt = sc.nextInt();

        if(isCusOrAgnt != 1 || isCusOrAgnt != 2){
            while(isCusOrAgnt != 1 && isCusOrAgnt != 2){
                System.out.println("Invalid Option");
                System.out.println(" PLESE SEELCT AN OPTION\n1 - Customer\n2 - Agent\n");
                isCusOrAgnt = sc.nextInt();
                if(isCusOrAgnt == 1 || isCusOrAgnt == 2){
                    break;
                }
            }
        }

         if (isCusOrAgnt == 1) {
             System.out.println("===== WELCOME TO OP BANK ======");
             System.out.println("===== CUSTOMER SECTION ======");
            System.out.println(" PLESE SELECT AN OPTION\n1 - Already Customer\n2 - New Customer");
            isNewOrOldCus = sc.nextInt();
            if (isNewOrOldCus == 1) {
                System.out.println("Welcome Back");
            } else {
                System.out.println("Welcome New Customer");
            }
        }
         else if (isCusOrAgnt == 2) {
             System.out.println("===== WELCOME TO OP BANK ======");
             System.out.println("===== AGENT SECTION ======");
            System.out.println("PLESE SELECT AN OPTION\n1 - Aleady Agent\n2 - New Agent");
            isNewOrOldAgnt = sc.nextInt();
            if (isNewOrOldAgnt == 1) {
                System.out.println("Welcome Back");
            } else {
                System.out.println("Welcome New Agent");
            }
        } else {
            System.out.println("Invalid Option");

        }



    }
}
