package collectionApi.groupProject;

import java.util.ArrayList;
import java.util.List;

public class TransactionServicesImpl implements TransactionServices{

    private static List<Transaction> transactionDb;
    public TransactionServicesImpl() {
        this.transactionDb = new ArrayList<>();
    }



    @Override
    public void createTransaction(int fromAccountId, int toAccountId, double amount) {


    }

    @Override
    public void updateTransaction(double newAmount) {

    }

    @Override
    public void deleteTransaction(int transactionId) {

    }

    @Override
    public void displayTransaction() {

    }
}
