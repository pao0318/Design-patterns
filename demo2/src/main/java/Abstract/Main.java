package Abstract;

public class Main {
    public static void main(String args[]){
        AbstractFactoryProducer abstractFactoryProducerOb = new AbstractFactoryProducer();
        AbstractFactory abstractFactoryObj = abstractFactoryProducerOb.getFactoryInstance("Premium");
        Car caObj = abstractFactoryObj.getInstance(5000000);
        System.out.println(caObj.getTopSpeed());
    }
}
