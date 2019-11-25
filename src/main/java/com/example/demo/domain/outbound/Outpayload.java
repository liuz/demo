package com.example.demo.domain.outbound;

public class Outpayload {
    public OutResults result;

    public Outpayload(){}

    public Outpayload(OutResults result) {
        this.result = result;
    }

    public OutResults getResult() {
        return result;
    }

    public void setResult(OutResults result) {
        this.result = result;
    }
}
