public class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomer(int id) {
        Customer c = repository.findCustomerById(id);
        System.out.println("Customer ID: " + c.getId());
        System.out.println("Customer Name: " + c.getName());
    }
}
