public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateReq() {

        System.out.println("validate lOgic of pay to merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit lOgic of pay to merchant");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit lOgic of pay to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate fees lOgic of pay to merchant");
    }
}

