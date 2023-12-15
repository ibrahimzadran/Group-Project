package collectionApi.groupProject;

public interface TransactionServices {

    void createTransaction(int fromAccountId, int toAccountId, double amount);
    void updateTransaction(double newAmount);
    void deleteTransaction(int transactionId);
    void displayTransaction();


}
