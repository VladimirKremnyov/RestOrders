package restOrders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import restOrders.dao.OrderDao;
import restOrders.dto.OrderDTO;
import restOrders.entity.Order;

import java.util.List;

import static restOrders.utils.Translator.*;
import static restOrders.utils.OrderGenerator.*;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public void addOrder(OrderDTO orderDTO) {
        orderDao.save(fromDTOToOrder(orderDTO));
    }

    @Override
    public List<OrderDTO> addGeneratedListOfOrders() {
        List<Order> generatedList = generateListOfOrders();
        orderDao.saveAll(generatedList);
        return fromOrderListToDTOList(generatedList);
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return fromOrderListToDTOList(orderDao.findAll());
    }

    @Override
    public List<OrderDTO> getAllOrdersOrderedByManagerName() {
        return fromOrderListToDTOList(orderDao.findAll(new Sort(Sort.Direction.ASC, "managerName")));
    }

    @Override
    public void updateOrder(OrderDTO orderDTO) {
        orderDao.save(fromDTOToOrder(orderDTO));
    }

    @Override
    public void deleteOrderById(long id) {
        orderDao.deleteById(id);
    }

    @Override
    public void deleteAllOrders() {
        orderDao.findAll();
        orderDao.deleteAll();
    }

}
