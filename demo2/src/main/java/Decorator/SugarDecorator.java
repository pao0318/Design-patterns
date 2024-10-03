public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public double cost() {
        return super.cost() + 0.2; // Add sugar cost
    }
}