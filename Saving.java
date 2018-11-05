public class Saving extends Account {
    // List properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the Saving properties
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    // List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("\tYour Savings Account Features" +
                "\n\tSafety Deposit Box ID: " + safetyDepositBoxID +
                "\n\tSafety Deposit Box Key: " + safetyDepositBoxKey + "\n");

    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
}
