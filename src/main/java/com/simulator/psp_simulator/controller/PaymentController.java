package com.simulator.psp_simulator.controller;

import com.simulator.psp_simulator.dto.PaymentRecord;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payments")
public class PaymentController {
    @PostMapping("/process")
    public PaymentRecord processPayment(){
        return PaymentRecord.approved();
    }
}
