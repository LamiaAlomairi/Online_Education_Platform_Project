package com.Online_Education_Platform.Online_Education_Platform.Services;

import com.Online_Education_Platform.Online_Education_Platform.Models.Payment;
import com.Online_Education_Platform.Online_Education_Platform.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public List<Payment> getAllPayments() {

        return paymentRepository.findAll();
    }
    public Payment getPaymentById(Integer id) {

        return paymentRepository.findById(id).get();
    }
}
