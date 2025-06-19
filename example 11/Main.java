public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl(); // dependency
        CustomerService service = new CustomerService(repo);    // injected

        service.printCustomer(1001);
    }
}
