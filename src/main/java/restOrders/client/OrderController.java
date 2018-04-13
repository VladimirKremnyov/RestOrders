package restOrders.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restOrders.dto.OrderDTO;
import restOrders.service.OrderServiceImpl;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OrderController {

    @Autowired
    private OrderServiceImpl service;

    @PostMapping("/orders/create")
    public void createOrder(@RequestBody OrderDTO order) {
        service.addOrder(order);
    }

    @GetMapping("/orders")
    public List<OrderDTO> getAllOrders() {
        return service.getAllOrders();
    }

    @PostMapping("/orders/update")
    public void updateOrder(@RequestBody OrderDTO orderDTO) {
        service.updateOrder(orderDTO);
    }

    @DeleteMapping("/orders/delete/{id}")
    public void deleteOrder(@PathVariable(value = "id") Long orderId) {
        service.deleteOrderById(orderId);
    }

}
