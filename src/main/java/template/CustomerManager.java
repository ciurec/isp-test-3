package template;

import template.model.Customer;

import java.util.HashSet;
import java.util.Set;

public class CustomerManager {

    private Set<Customer> customers;

    public CustomerManager() {
        this.customers = new HashSet<>();
    }

}
