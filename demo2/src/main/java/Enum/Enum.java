
package Enum;
public class Enum {
    public static void main(String args[]) {
        Abc obj1 = Abc.INSTANCE;
        obj1.i=5;
        obj1.show();

        Abc obj2 =Abc.INSTANCE;
        obj2.i=6;
        obj2.show();

        // Here both obj1 and obj2 refers to the same instance

    }
}

enum Abc {  // Special type of class
 INSTANCE;
 // Similar to public static Abc getInstance(){}
 int i;
 public void show(){
     System.out.println(i);
 }

}
