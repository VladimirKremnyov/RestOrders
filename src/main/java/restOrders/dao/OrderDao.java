package restOrders.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import restOrders.entity.Order;


public interface OrderDao extends MongoRepository<Order, Long> {

}