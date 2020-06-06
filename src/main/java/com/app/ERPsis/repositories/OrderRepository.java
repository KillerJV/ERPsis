package com.app.ERPsis.repositories;

import com.app.ERPsis.model.Order;
import com.app.ERPsis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
