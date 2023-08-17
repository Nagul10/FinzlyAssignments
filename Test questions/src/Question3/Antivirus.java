package Question3;

import sun.util.locale.provider.AvailableLanguageTags;

public class Antivirus {
    private final String productKey;
    private boolean activation;
    Antivirus(){
        this.productKey = null;
        this.activation = false;
        System.out.println("You are using the free version Please Upgrade");
    }
    Antivirus(String productKey){
        this.productKey = productKey;
        this.activation = false;
        System.out.println("Please Do the transaction to approve product key");
    }

    public void activate(Transaction transaction){
        if(transaction.transactionDone()){
            activation = true;
            System.out.println("Activated");

        }
        else {
            System.out.println("Transaction not done");
            System.out.println("Product Key Not Activated");
        }
    }
}
