import java.util.LinkedList;
import java.util.List;

public class BankAccountDrivenApp {
    public static void main(String[] args){
        //Checking chkacc1 = new Checking("Tom Wilson", "32145678", 1500);

        //Saving savacc1 = new Saving("John Smith", "12345634", 1200);

        List<Account> accounts = new LinkedList<Account>();


        // Read a CVS file then create new accounts based on the data
        String file = "/Users/diepla/Downloads/NewBankAccounts.csv";
        List<String[]> newAccountHolders = utilities.CVS.read(file);

        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                accounts.add(new Saving(name, sSN, initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for(Account acc : accounts){
            acc.showInfo();
            System.out.println("\n************************");
        }
    }
}
