package Builder;

public class Phone {
    private String os;
    private int ram;
    private String screensize;
    private String processor;
    private int battery;

    public Phone(String os, int ram, String screensize, String processor, int battery){
        super();
        this.os = os;
        this.battery = battery;
        this.screensize = screensize;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString(){
        return "Phone [ os = "+ os + ", ram = " + ram + ", processor = " +processor+
                ", screensize = " +screensize + ", battery = "+battery + "]";
    }

}
