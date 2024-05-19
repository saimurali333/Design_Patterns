package FactoryPattern;

public class DefaultShape implements IShape {

    @Override
    public void draw() {
        System.out.println("Draw a default shape");
    }
}
