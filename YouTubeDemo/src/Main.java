public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();

        CustomerManager customerManager1 = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager1.GiveCredit();


    }

    public static class CustomerManager {
        private Customer _customer;
        ICreditManager _creditManager;


        public CustomerManager(Customer customer, ICreditManager creditManager) {
            _customer = customer;
            _creditManager = creditManager;
        }

        public void Save() {

            System.out.println("Müşteri Kaydedildi: " + _customer.FirstName + " " + _customer.LastName);
        }

        public void Delete() {

            System.out.println("Müşteri Silindi: " + _customer.FirstName + " " + _customer.LastName);
        }

        public void GiveCredit() {
            _creditManager.Calculate();
            System.out.println("Kredi Verildi");

        }
    }


    public static class CreditManager {
        public void Calculate() {
            System.out.println("Hesaplandı");
        }

        public void Save() {
            System.out.println("Kredi Verildi");
        }
    }

    static class Customer {

        public void Customer() {
            System.out.println("Müşteri Nesnesi Başlatıldı");
        }

        public int Id;
        public String FirstName;
        public String LastName;


        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

    }

    static class Company extends Customer {
        public String getTaxNumber() {
            return TaxNumber;
        }

        public void setTaxNumber(String taxNumber) {
            TaxNumber = taxNumber;
        }

        String TaxNumber;
    }

    static class Person extends Customer {

        public String getNationalIdentity() {
            return NationalIdentity;
        }


        public void setNationalIdentity(String nationalIdentity) {
            NationalIdentity = nationalIdentity;
        }

        public String NationalIdentity;
    }

    interface ICreditManager {
        void Calculate();

        void Save();
    }

    static class TeacherCreditManager  implements ICreditManager  {

        @Override
        public void Calculate() {
            System.out.println("Öğretmen Kredisi Hesaplandı ");
        }

        @Override
        public void Save() {

        }
    }

    static class MilitaryCreditManager implements ICreditManager {

        @Override
        public void Calculate() {
            System.out.println("Asker Kredisi Hesaplandı ");
        }

        @Override
        public void Save() {

        }
    }
   abstract class BaseCreditManager implements ICreditManager {

        @Override
        public void Calculate() {

        }

        @Override
        public void Save() {
            System.out.println("Kaydedildi");

        }
    }

}