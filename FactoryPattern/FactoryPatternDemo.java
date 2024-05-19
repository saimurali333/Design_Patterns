package FactoryPattern;


public class FactoryPatternDemo {

    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();

//        shapeFactory.registerShape(Shape.RECTANGLE, Rectangle.class);
//        shapeFactory.registerShape(Shape.CIRCLE, Circle.class);
//        shapeFactory.registerShape(Shape.SQUARE, Square.class);
        IShape shape1 = shapeFactory.getShape(ShapeEum.RECTANGLE.toString());
        shape1.draw();

        // Get an object of Rectangle and call its draw method.
        IShape shape2 = shapeFactory.getShape(ShapeEum.CIRCLE.toString());
        if(shape2 != null) {
            shape2.draw();
        }

        // Get an object of Square and call its draw method.
        IShape shape3 = shapeFactory.getShape(ShapeEum.SQUARE.toString());
        if(shape3!=null) {
            shape3.draw();
        }
    }
}
