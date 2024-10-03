public MilkDecorator implements extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
        }

        @Override
        public double cost() {
        return super.cost() + 0.5; // Add milk cost
        }
}