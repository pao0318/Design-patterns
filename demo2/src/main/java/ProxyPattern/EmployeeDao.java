package ProxyPattern;

public interface EmployeeDao {
    public void create(String client, Employee obj);
    public void delete(String client, int empId);

    public Employee getInfo(String client, int empId);
}
