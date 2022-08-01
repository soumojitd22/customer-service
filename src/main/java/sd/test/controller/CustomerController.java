package sd.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sd.test.model.Customer;
import sd.test.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public Customer getCustomerInfo(@RequestParam("id") int customerId) {
        return customerService.getCustomerInfo(customerId);
    }
}
