public class MainCoffeeShop{
    public static void main(String args[]){

        Coffee coffee =  new SimpleCoffee();
        System.out.println("Cost of simple coffee: $"+coffee.cost());

        coffee = new MilkDecorator();
        System.out.println("Cost of milk coffee: $"+coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println("Cost after adding Sugar: $" + coffee.cost());
    }
}