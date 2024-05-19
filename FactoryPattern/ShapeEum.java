package FactoryPattern;

public enum ShapeEum {
    CIRCLE(Circle.class),RECTANGLE(Rectangle.class),SQUARE(Square.class),TRIANGLE(null);

    private Class<? extends IShape> shapeClass;
    ShapeEum(Class<? extends IShape> shapeClass){
        this.shapeClass = shapeClass;
    }

    public Class<? extends IShape> getShapeClass(){
        return shapeClass;
    }
}
