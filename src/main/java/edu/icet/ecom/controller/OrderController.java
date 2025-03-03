package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Order;
import edu.icet.ecom.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    final OrderService orderService;

    @PostMapping("/place-order")
    public void placeOrder(@RequestBody Order order){
        orderService.placeOrder(order);
    }
}
