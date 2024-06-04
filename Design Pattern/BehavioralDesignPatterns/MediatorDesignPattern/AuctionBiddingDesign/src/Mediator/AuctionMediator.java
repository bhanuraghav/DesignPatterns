package Mediator;

import Bidder.Bidder;

public interface AuctionMediator {

    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder,int bidAmount);



}
