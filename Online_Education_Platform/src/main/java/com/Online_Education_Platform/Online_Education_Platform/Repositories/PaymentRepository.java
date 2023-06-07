package com.Online_Education_Platform.Online_Education_Platform.Repositories;

import com.Online_Education_Platform.Online_Education_Platform.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
