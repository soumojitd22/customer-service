package sd.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd.test.model.Customer;
import sd.test.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerInfo(int customerId) {
        return customerRepository.getCustomerInfo(customerId);
    }
}
