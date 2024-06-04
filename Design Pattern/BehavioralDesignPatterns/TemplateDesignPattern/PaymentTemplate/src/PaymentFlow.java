public abstract class PaymentFlow {

    public abstract void validateReq();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney(){
        validateReq();
        debitAmount();
        calculateFees();
        creditAmount();
    }




}
