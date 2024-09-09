package Singleton;

class ABC {

    static ABC obj;
    private ABC(){
        System.out.println("Instance Created");
    }
    public static  ABC getInstance(){  // Enum
        if(obj==null){
            synchronized (ABC.class){
                if(obj ==null)
                    obj = new ABC();
            }

        }

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
