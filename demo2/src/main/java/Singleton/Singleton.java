package Singleton;

class ABC {

    static ABC obj = new ABC();   // Eager
    private ABC(){

    }
    public static ABC getInstance(){
        return obj;
    }
}
public class Singleton {
    ABC ob1 =  ABC.getInstance();
}
