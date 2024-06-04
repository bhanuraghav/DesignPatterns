import Processes.Invoice;
import Processes.Payment;
import Processes.ProductOrder;

public class OrderFacade {

    Payment payment;
    ProductOrder productOrder;
    Invoice invoice;


    public OrderFacade(){
        payment = new Payment();
        productOrder = new ProductOrder();
        invoice = new Invoice();
    }

    public void createOrder(){
        productOrder.orderProduct();
        payment.makePayment();
        invoice.generateInvoice();
    }





}
