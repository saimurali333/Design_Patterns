/*
    * Client.java
 */

public class Client {
    public static void main(String[] args) {
        Builder builder = new ProductConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());
    }
}
