package Visitor;

import Element.DoubleRoom;
import Element.DuplexRoom;
import Element.SingleRoom;

public class RoomMaintenanceVisitor implements RoomVisitor{

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double Room Maintenance");
    }

    @Override
    public void visit(DuplexRoom duplexRoom) {
        System.out.println("Duplex Room Maintenance");
    }

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single Room Maintenance");
    }

}
