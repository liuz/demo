package com.example.demo.domain.inbound;

public class InBillCycleExceptions {
    public InResults results;

    public InBillCycleExceptions() {}

    public InBillCycleExceptions(InResults results) {
        this.results = results;
    }

    public InResults getInResults() {
        return results;
    }

    public void setInResults(InResults results) {
        this.results = results;
    }
}
