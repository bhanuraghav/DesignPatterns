import Bidder.MiBidder;
import Bidder.Bidder;
import Mediator.Auction;
import Mediator.AuctionMediator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AuctionMediator auctionMediator = new Auction();
        Bidder bidder1 = new MiBidder("Rohit Sharma", auctionMediator);
        Bidder bidder2 = new MiBidder("Hardik Pandya", auctionMediator);

        bidder1.placeBid(1000);
        bidder2.placeBid(5000);
        bidder1.placeBid(6000);


    }
}