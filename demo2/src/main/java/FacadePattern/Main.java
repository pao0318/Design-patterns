package FacadePattern;

public class Main {
    public static void main(String args[]){
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee1 emp= employeeFacade.getEmployeeDetails(123);
    }
}
