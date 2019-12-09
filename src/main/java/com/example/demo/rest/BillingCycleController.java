package com.example.demo.rest;

import com.example.demo.domain.outbound.Outpayload;
import com.example.demo.domain.inbound.Inpayload;
import com.example.demo.service.BillingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/billingcycle")
public class BillingCycleController {

    private final static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
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
        log.info("format payload");
        return billingService.processPayload(inpayload);
    }
}
