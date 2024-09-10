package ProxyPattern;

public class EmployeeProxy implements EmployeeDao {
    EmployeeDao employeeDaoObj = new EmployeeImplementation();

    @Override
    public void create(String client, Employee obj) {
        if (client.equals("ADMIN"))
            employeeDaoObj.create(client, obj);
        else
            System.out.println("Access Denied");
    }

    @Override
    public void delete(String client, int empId) {
        if (client.equals("ADMIN"))
            employeeDaoObj.delete(client, empId);
        else
            System.out.println("Access Denied");
    }

    @Override
    public Employee getInfo(String client, int empId) {
        if (client.equals("ADMIN") || client.equals("USER"))
            return employeeDaoObj.getInfo(client, empId);
        return null;
    }
}