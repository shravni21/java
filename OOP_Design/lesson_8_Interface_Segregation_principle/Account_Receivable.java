public class Account_Receivable {
    // If something is changed in transaction will lead to changes in account
    private CustomerTransaction transactionObject;
    public Account_Receivable(CustomerTransaction c){
        transactionObject=c;
    }
    public void PostPayment(){
       transactionObject.chargeCustomer();
    }
    public void sendVoice(){
        transactionObject.prepareInvoice();
    }
}
