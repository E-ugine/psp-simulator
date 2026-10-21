package com.simulator.psp_simulator.controller;

import com.simulator.psp_simulator.behavior.SettingsHolder;
import com.simulator.psp_simulator.constants.Status;
import com.simulator.psp_simulator.dto.PaymentRecord;
import com.simulator.psp_simulator.dto.Settings;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payments")
public class PaymentController {

    private final SettingsHolder holder;

    public PaymentController (SettingsHolder holder){
        this.holder = holder;
    }
    @PostMapping("/process")
    public PaymentRecord processPayment() throws  InterruptedException{
        Settings settings = holder.getMode();
        if ( settings.status() == Status.SLOW){
            Thread.sleep(settings.delaySeconds() *1000L);
        }
        return PaymentRecord.approved();
    }
}
