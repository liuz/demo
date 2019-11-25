package com.example.demo.rest;

import com.example.demo.domain.outbound.Outpayload;
import com.example.demo.domain.inbound.Inpayload;
import com.example.demo.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billingcycle")
public class BillingCycleController {

    @Autowired
    BillingService billingService;

    @RequestMapping(value = "/payload",
            method = RequestMethod.POST,
            consumes = "application/json",
            produces = "application/json")
    public Outpayload getPayload(@RequestBody Inpayload inpayload) {
        if(inpayload == null) {
            return new Outpayload();
        }
        return billingService.processPayload(inpayload);
    }
}
