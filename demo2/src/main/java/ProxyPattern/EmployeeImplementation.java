package ProxyPattern;

public class EmployeeImplementation implements EmployeeDao {

    @Override
    public void create(String client, Employee obj) {
        System.out.println("Created new employee");
    }

    @Override
    public void delete(String client, int empId) {
        System.out.println("Deleted the employee");
    }

    @Override
    public Employee getInfo(String client, int empId) {
        System.out.println("Fetching the data");
        return new Employee(client,empId);
    }
}
