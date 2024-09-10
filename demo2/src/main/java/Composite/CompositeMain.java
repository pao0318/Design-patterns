package Composite;

public class CompositeMain {
    public static void main(String args[]){
        Component hd = new Leaf("HDDD",4000);
        Component mouse = new Leaf("Mouse",200);
        Component monitor = new Leaf("Monitor",2000);
        Component ram = new Leaf("Ram",1000);
        Component cpu = new Leaf("CPU",30000);

        Composite ph = new Composite("Peripheral");
        Composite cabinets = new Composite("cabinets");
        Composite mb = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        mb.addComponent(ram);
        mb.addComponent(cpu);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinets.addComponent(hd);
        cabinets.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinets);

        computer.show();


    }
}
