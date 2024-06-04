import java.awt.*;

public class ShapeFactory {


    public Shape getShape(String text){
        return switch (text) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }



}
