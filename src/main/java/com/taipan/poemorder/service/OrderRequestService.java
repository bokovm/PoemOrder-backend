package com.taipan.poemorder.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.taipan.poemorder.dto.OrderRequestDto;
import com.taipan.poemorder.model.OrderRequest;
import com.taipan.poemorder.repository.OrderRequestRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderRequestService {

    private final OrderRequestRepository repository;

    public OrderRequest createOrder(OrderRequestDto dto) {
        log.info("Creating order for: {} {}", dto.getFirstName(), dto.getLastName());

        OrderRequest order = new OrderRequest();
        order.setFirstName(dto.getFirstName());
        order.setLastName(dto.getLastName());
        order.setPhone(dto.getPhone());
        order.setSocialLinks(dto.getSocialLinks());
        order.setDescription(dto.getDescription());

        OrderRequest savedOrder = repository.save(order);
        log.info("Order created with ID: {}", savedOrder.getId());

        return savedOrder;
    }
}