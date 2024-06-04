package Element;

import Visitor.RoomVisitor;

public interface RoomElement {
    void accept(RoomVisitor roomVisitor);
}
