package restOrders.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restOrders.dao.OrderDao;
import restOrders.dto.OrderDTO;

import java.util.List;

import static restOrders.utils.Translator.*;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public void addOrder(OrderDTO orderDTO) {
        orderDao.save(fromDTOToOrder(orderDTO));
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return fromOrderListToDTOList(orderDao.findAll());
    }

    @Override
    public void updateOrder(OrderDTO orderDTO) {
        orderDao.save(fromDTOToOrder(orderDTO));
    }

    @Override
    public void deleteOrderById(long id) {
        orderDao.deleteById(id);
    }

}
