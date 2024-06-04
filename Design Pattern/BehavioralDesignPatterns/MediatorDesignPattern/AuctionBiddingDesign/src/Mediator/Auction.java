package Mediator;

import Bidder.Bidder;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Bidder> bidderList = new ArrayList<>();


    @Override
    public void addBidder(Bidder bidder) {
        bidderList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {

        for (Bidder b : bidderList) {
            if (!b.getName().equals(bidder.getName())) {
                b.recieveBidNotification(bidAmount);
            }
        }

    }
}
