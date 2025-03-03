package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.entity.OrderEntity;
import edu.icet.ecom.repository.OrderDao;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final OrderDao orderDao;
    final ModelMapper modelMapper;

    @Override
    public void placeOrder(Order order) {
        orderDao.save(modelMapper.map(order, OrderEntity.class));
    }

    @Override
    public List<Order> getAllOrders() {
        return List.of();
    }
}
