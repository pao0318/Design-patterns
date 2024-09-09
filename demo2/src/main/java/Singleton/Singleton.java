package Singleton;

class ABC {

    static ABC obj;   // Eager Lazy
    private ABC(){
        System.out.println("Instance Created");
    }
    public static synchronized ABC getInstance(){
        if(obj==null)
            obj = new ABC();
        return obj;
    }
}
public class Singleton {
    public static void main(String args[]){
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                ABC obj = ABC.getInstance();
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                ABC obj = ABC.getInstance();
            }
        });
        t1.start();
        t2.start();


    }
}
