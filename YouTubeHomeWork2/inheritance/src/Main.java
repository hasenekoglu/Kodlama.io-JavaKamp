public class Main {
    public static void main(String[] args) {

        Person customer= new Customer();
        customer.firstName = "Selim Müşteri";
        Person employee = new Employee();
        employee.firstName = "Ahmet Personel";

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();



    }
}