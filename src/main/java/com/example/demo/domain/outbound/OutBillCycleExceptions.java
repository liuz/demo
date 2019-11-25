package com.example.demo.domain.outbound;

public class OutBillCycleExceptions {

    public OutResults result;

    public OutBillCycleExceptions() {}

    public OutBillCycleExceptions(OutResults result) {
        this.result = result;
    }

    public OutResults getResult() {
        return result;
    }

    public void setResult(OutResults result) {
        this.result = result;
    }


}
