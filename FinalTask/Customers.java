package FinalTask;

import java.util.*;

public class Customers {
    ArrayList<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getByCreditCardNumber(String minNumber, String maxNumber) {
        ArrayList<Customer> customersFound = new ArrayList<>();
        for (Customer c : customers) {
            if (Double.parseDouble(c.getCreditCardNumber()) >= Double.parseDouble(minNumber) & Double.parseDouble(c.getCreditCardNumber()) <= Double.parseDouble(maxNumber)) {
                customersFound.add(c);
            }
        }

        if (customersFound.isEmpty()) {
            System.out.println("No customers with defined CC numbers");
        }
        return customersFound;

    }

    public String[] sortFullNames() {
        String[] fullNamesSorted = new String[customers.size()];
        for (Customer c : customers) {
            for (int i = c.getId() - 1; i < customers.size(); i++) {
                fullNamesSorted[i] = c.getFullName();
            }
        }
        Arrays.sort(fullNamesSorted);
        return fullNamesSorted;
    }

    public ArrayList<Customer> sortListByFullNames(String[] fullNamesSorted) {
        ArrayList<Customer> customersSorted = new ArrayList<Customer>();
        int i = 0;
        int size = customers.size();
        while (size != customersSorted.size()) {
            for (Customer c : customers) {
                if (fullNamesSorted[i].equals(c.getFullName())) {
                    customersSorted.add(c);
                    i++;
                    if (i == customers.size()) {
                        break;

                    }
                }
            }
        }

        return customersSorted;
    }

}

