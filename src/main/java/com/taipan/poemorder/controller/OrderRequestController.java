package com.taipan.poemorder.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.taipan.poemorder.dto.OrderRequestDto;
import com.taipan.poemorder.model.OrderRequest;
import com.taipan.poemorder.service.OrderRequestService;

@CrossOrigin(origins = {"http://localhost:5500", "http://frontend:5500"})
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/orders")
public class OrderRequestController {

    private final OrderRequestService service;

    @PostMapping
    public ResponseEntity<OrderRequest> create(@RequestBody OrderRequestDto dto) {
        try {
            OrderRequest order = service.createOrder(dto);
            return ResponseEntity.ok(order);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Backend is running!");
    }
}