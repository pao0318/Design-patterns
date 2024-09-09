package Prototype;

class Main {
    public static void main(String args[]){

        Student obj = new Student("Sid",318,23);
//        obj.show();
        Student cloneObj = (Student) obj.clone();
        cloneObj.show();

    }
}

class Student implements Prototype{
    private String name;
    private int age;
    private int rollNumber;

     Student(String name,int rollNumber, int age){
         this.age = age;
         this.rollNumber = rollNumber;
         this.name = name;
     }
     @Override
     public Prototype clone(){
         return new Student(name,rollNumber,age);
     }
     void show(){
         System.out.println("Age is "+age+ ", Name is "+ name+ ", Roll is "+rollNumber);
     }

}
