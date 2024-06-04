package Bidder;

import Mediator.AuctionMediator;

public class MiBidder implements Bidder {

    String name;
    AuctionMediator auctionMediator;


    public MiBidder(String name, AuctionMediator auctionMediator) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void recieveBidNotification(int bidAmount) {
        System.out.println("bidder " + name + " got the notification of bid : " + bidAmount);
    }
}
