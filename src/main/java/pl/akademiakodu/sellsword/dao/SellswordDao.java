package pl.akademiakodu.sellsword.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.sellsword.model.Sellsword;

public interface SellswordDao extends CrudRepository<Sellsword, Integer> {
}
