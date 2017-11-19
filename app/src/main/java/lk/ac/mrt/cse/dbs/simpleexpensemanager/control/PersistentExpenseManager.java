package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentTransactionDAO;

/**
 * Created by Thilina Pathirana on 11/19/2017.
 */

public class PersistentExpenseManager extends ExpenseManager {
    Context context;

    public PersistentExpenseManager(Context context){
        this.context = context;
        setup();
    }


    @Override
    public void setup(){
        TransactionDAO persistentTransaction = new PersistentTransactionDAO(this.context);
        setTransactionsDAO(persistentTransaction);

        AccountDAO persistentAccount = new PersistentAccountDAO(this.context);
        setAccountsDAO(persistentAccount);

        // dummy data
//        Account dummyAcct1 = new Account("12345A", "Yoda Bank", "Anakin Skywalker", 10000.0);
//        Account dummyAcct2 = new Account("78945Z", "Clone BC", "Obi-Wan Kenobi", 80000.0);
//        getAccountsDAO().addAccount(dummyAcct1);
//        getAccountsDAO().addAccount(dummyAcct2);
    }
}
