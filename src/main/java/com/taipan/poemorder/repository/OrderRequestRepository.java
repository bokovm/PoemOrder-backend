package com.taipan.poemorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taipan.poemorder.model.OrderRequest;

public interface OrderRequestRepository extends JpaRepository<OrderRequest, Long> {
}