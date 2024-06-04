public class PayToFriend extends PaymentFlow{

    @Override
    public void validateReq() {
        System.out.println("validate lOgic of Pay to friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit lOgic of Pay to friend");

    }

    @Override
    public void debitAmount() {
        System.out.println("debit lOgic of Pay to friend");

    }

    @Override
    public void calculateFees() {
        System.out.println("calculate fees lOgic of Pay to friend");

    }
}

