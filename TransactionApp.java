package collectionApi.groupProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransactionApp {

    public static Transaction makeTransaction(Scanner sc) {
        System.out.println("Please enter amount to withdraw");
        int amount = sc.nextInt();


        Transaction transaction = new Transaction();
        return transaction;
    }


    public static void main(String[] args) {
        TransactionServicesImpl tranaction = new TransactionServicesImpl();
        Scanner sc = new Scanner(System.in);

        int choice;
        boolean menu = true;

        try {

            do {
                System.out.println("""
                        1) make transaction
                        2) update transaction
                        3) Remove transaction
                        4) Show transaction
                        5) exit app
                        """);

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        sc.nextLine();
                        Transaction transaction = makeTransaction(sc);
                        tranaction.createTransaction(transaction);
                        tranaction.displayTransaction();
                        break;
                    case 2:
                        tranaction.displayTransaction();

                    case 3:
                        tranaction.displayTransaction();
                        sc.nextLine();
                        tranaction.updateTransaction(new Transaction());
                        sc.nextInt();
                        break;

                    case 4:
                        System.out.println("Transaction You made");
                        tranaction.displayTransaction();
                        break;
                    default:
                        System.out.println("Wrong input ");


                }
            }
            while (menu);


        } catch (InputMismatchException e) {
            System.out.println("wrong input! ");
        }
    }
}


