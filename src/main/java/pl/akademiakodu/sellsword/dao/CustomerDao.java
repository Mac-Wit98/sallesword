package pl.akademiakodu.sellsword.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.sellsword.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {
}
