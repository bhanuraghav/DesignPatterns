package Element;

import Visitor.RoomVisitor;

public class DuplexRoom implements RoomElement {

    public int roomPrice = 0;


    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
