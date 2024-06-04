package Visitor;

import Element.DoubleRoom;
import Element.DuplexRoom;
import Element.SingleRoom;

public class RoomPricingVisitor implements RoomVisitor{

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double Room Pricing");
        doubleRoom.roomPrice = 1000;
    }

    @Override
    public void visit(DuplexRoom duplexRoom) {
        System.out.println("Duplex Room Pricing");
        duplexRoom.roomPrice = 5000;
    }

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single Room Pricing");
        singleRoom.roomPrice = 500;
    }

}
