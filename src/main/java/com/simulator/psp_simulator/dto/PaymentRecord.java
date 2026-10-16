package com.simulator.psp_simulator.dto;

public record PaymentRecord(String status) {
    public static PaymentRecord approved(){
        return  new PaymentRecord("approved");

    }
}
