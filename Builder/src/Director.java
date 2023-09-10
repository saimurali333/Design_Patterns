public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA("I build part A")
                .buildPartB("I build part B")
                .buildPartC("I build part C");
    }
}

