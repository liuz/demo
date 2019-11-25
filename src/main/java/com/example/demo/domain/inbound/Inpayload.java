package com.example.demo.domain.inbound;

public class Inpayload {

    public InResults results;

    public Inpayload(){}

    public Inpayload(InResults results) {
        this.results = results;
    }

    public InResults getInResults() {
        return results;
    }

    public void setInResults(InResults results) {
        this.results = results;
    }
}
