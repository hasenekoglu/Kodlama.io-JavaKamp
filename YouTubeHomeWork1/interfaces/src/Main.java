public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.Add();
        ICustomerDal customerDal1 = new OracleCustomerDal();
        customerDal1.Add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();



    }
}