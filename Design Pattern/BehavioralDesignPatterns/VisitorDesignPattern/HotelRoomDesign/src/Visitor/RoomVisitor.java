package Visitor;

import Element.DoubleRoom;
import Element.DuplexRoom;
import Element.RoomElement;
import Element.SingleRoom;

public interface RoomVisitor {

    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
    void visit(DuplexRoom duplexRoom);



}
