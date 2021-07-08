package FinalTask;

public class CustomersDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Snow", "John", "D", "Some address 1-2", "1234123412341234", 125);
        Customer c2 = new Customer(2, "Dory", "Eliza", "J", "One more address 3", "4111111111111111", 876);
        Customer c3 = new Customer(3, "Adams", "Michael", "S", "Address 5", "4000400040004000", 765);
        Customers customers = new Customers();
        customers.addCustomer(c1);
        customers.addCustomer(c2);
        customers.addCustomer(c3);


        System.out.println("Customers with Credit cards:" + customers.getByCreditCardNumber("1233", "1234123412341235"));

        System.out.println("Sorted customers list: " + customers.sortListByFullNames(customers.sortFullNames()));

    }
}
