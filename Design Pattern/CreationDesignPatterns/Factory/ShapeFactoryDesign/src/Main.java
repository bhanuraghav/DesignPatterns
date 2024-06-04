//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s1 = shapeFactory.getShape("CIRCLE");
        Shape s2 = shapeFactory.getShape("RECTANGLE");
        Shape s3 = shapeFactory.getShape("SQUARE");

        s1.draw();
        s2.draw();
        s3.draw();


    }
}