package com.Online_Education_Platform.Online_Education_Platform.Controllers;

import com.Online_Education_Platform.Online_Education_Platform.Models.Payment;
import com.Online_Education_Platform.Online_Education_Platform.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "payment")
public class PaymentController {
    //    http://localhost:8080/payment/getAll
    @Autowired
    PaymentService paymentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment> getAllPayments() {

        return paymentService.getAllPayments();
    }
    @GetMapping(value = "getById")
    public Payment getPaymentById(@RequestParam Integer id) {

        return paymentService.getPaymentById(id);
    }
}
