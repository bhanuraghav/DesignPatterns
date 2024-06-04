import Element.DoubleRoom;
import Element.DuplexRoom;
import Element.RoomElement;
import Element.SingleRoom;
import Visitor.RoomMaintenanceVisitor;
import Visitor.RoomPricingVisitor;
import Visitor.RoomVisitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RoomElement singleRoomObj = new SingleRoom();
        RoomElement doubleRoomObj = new DoubleRoom();
        RoomElement duplexRoomObj = new DuplexRoom();

        RoomVisitor pricingVisitorObj = new RoomPricingVisitor();

        singleRoomObj.accept(pricingVisitorObj);
        System.out.println(((SingleRoom)singleRoomObj).roomPrice);

        RoomVisitor maintenanceVisitorObj = new RoomMaintenanceVisitor();
        duplexRoomObj.accept(maintenanceVisitorObj);









    }
}