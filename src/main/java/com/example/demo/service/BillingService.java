package com.example.demo.service;

import com.example.demo.domain.inbound.InResults;
import com.example.demo.domain.inbound.Inpayload;
import com.example.demo.domain.outbound.Outpayload;

public interface BillingService {

    Outpayload processPayload(Inpayload inpayload);
}
