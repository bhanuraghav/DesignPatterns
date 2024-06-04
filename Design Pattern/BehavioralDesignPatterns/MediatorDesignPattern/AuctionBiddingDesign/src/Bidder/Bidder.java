package Bidder;

public interface Bidder {

    void placeBid(int bidAmount);
    void recieveBidNotification(int bidAmount);
    String getName();


}
