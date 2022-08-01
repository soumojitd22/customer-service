package sd.test.repository;

import org.springframework.stereotype.Repository;
import sd.test.model.Customer;

import java.util.Map;

@Repository
public class CustomerRepository {
    private final Map<Integer, Customer> mapOfCustomers = Map.of(
            1, new Customer(1, "Soumojit Dutta", "56/2, Adarshanagar, Behala, Kolkata - 700061", 9804225754L),
            2, new Customer(2, "Ashima Dutta", "11, West Adarshanagar, Kolkata - 700034", 8961356100L),
            3, new Customer(3, "Srabana Paul", "27, Dakshinpally, Rahara, N. Pgs - 700114", 7980161351L),
            4, new Customer(4, "Santona Sarkar", "22, Kanchrapara, N. Pgs - 700118", 8547421024L));

    public Customer getCustomerInfo(int customerId) {
        return mapOfCustomers.get(customerId);
    }
}
