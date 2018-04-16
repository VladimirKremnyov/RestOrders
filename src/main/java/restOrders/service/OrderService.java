package restOrders.service;

import restOrders.dto.OrderDTO;

import java.util.List;


public interface OrderService {

    void addOrder(OrderDTO orderDTO);

    List<OrderDTO> getAllOrders();

    List<OrderDTO> getAllOrdersOrderedByManagerName();

    void updateOrder(OrderDTO orderDTO);

    void deleteOrderById(long id);

    List<OrderDTO> addGeneratedListOfOrders();

    void deleteAllOrders();
}
