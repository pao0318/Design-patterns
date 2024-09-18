package FacadePattern;

public class EmployeeFacade {
 EmployeeDao employeeDao;

 public EmployeeFacade(){
     employeeDao = new EmployeeDao();
 }

 public void insert(){
     employeeDao.insert();
 }

 public Employee1 getEmployeeDetails(int empId){
     return employeeDao.getEmployeeDetails(empId);
 }

}
