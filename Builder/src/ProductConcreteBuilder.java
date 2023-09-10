public class ProductConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public Builder buildPartA(String partA){
        product.setPartA(partA);
        return this;
    }

    @Override
    public Builder buildPartB(String partB){
        product.setPartB(partB);
        return this;
    }

    @Override
    public Builder buildPartC( String partC){
        product.setPartC(partC);
        return this;
    }

    @Override
    public Product getResult() {
        return product;
    }
}
