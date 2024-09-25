public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}