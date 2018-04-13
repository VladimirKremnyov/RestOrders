package restOrders.utils;

import restOrders.dto.OrderDTO;
import restOrders.dto.RequirementsDTO;
import restOrders.entity.Order;
import restOrders.entity.Requirements;

import java.util.ArrayList;
import java.util.List;

public class Translator {

    public static OrderDTO fromOrderToDTO(Order order) {

        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setManagerName(order.getManagerName());
        dto.setOrganization(order.getOrganization());
        dto.setNumberOfAthletes(order.getNumberOfAthletes());

        RequirementsDTO requirementsDTO = new RequirementsDTO();

        requirementsDTO.setTrainings(order.getRequirements().isTrainings());
        requirementsDTO.setSauna(order.getRequirements().isSauna());
        requirementsDTO.setGym(order.getRequirements().isGym());
        requirementsDTO.setNumberOfTrainingsSession(order.getRequirements().getNumberOfTrainingsSession());

        dto.setRequirements(requirementsDTO);

        dto.setCountry(order.getCountry());
        dto.setStatus(order.getStatus());

        return dto;

    }

    public static Order fromDTOToOrder(OrderDTO dto) {

        Order order = new Order();
        order.setId(dto.getId());
        order.setManagerName(dto.getManagerName());
        order.setOrganization(dto.getOrganization());
        order.setNumberOfAthletes(dto.getNumberOfAthletes());

        Requirements requirements = new Requirements();

        requirements.setTrainings(dto.getRequirements().isTrainings());
        requirements.setSauna(dto.getRequirements().isSauna());
        requirements.setGym(dto.getRequirements().isGym());
        requirements.setNumberOfTrainingsSession(dto.getRequirements().getNumberOfTrainingsSession());

        order.setRequirements(requirements);

        order.setCountry(dto.getCountry());
        order.setStatus(dto.getStatus());

        return order;

    }

    public static List<OrderDTO> fromOrderListToDTOList(List<Order> orders) {

        List<OrderDTO> dtoList = new ArrayList<>(orders.size());
        for (Order order : orders) {
            dtoList.add(fromOrderToDTO(order));
        }

        return dtoList;

    }

    public static List<Order> fromDTOListToOrderList(List<OrderDTO> dtoList) {

        List<Order> orders = new ArrayList<>(dtoList.size());
        for (OrderDTO dto : dtoList) {
            orders.add(fromDTOToOrder(dto));
        }

        return orders;

    }


}
