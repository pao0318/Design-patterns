package ProxyPattern;

public class EmployeeMain {
    public static void main(String args[]){
        EmployeeDao empObj = new EmployeeProxy();
        empObj.create("ADMIN",new Employee("Sid",18));
        System.out.println("Operation successful");
    }
}
