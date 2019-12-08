package com.example.demo.domain.outbound;

public class Outpayload {
    public OutBillCycleExceptions billCycleExceptions;

    public Outpayload() {}

    public Outpayload(OutBillCycleExceptions billCycleExceptions) {
        this.billCycleExceptions = billCycleExceptions;
    }

    public OutBillCycleExceptions getBillCycleExceptions() {
        return this.billCycleExceptions;
    }

    public void setBillCycleExceptions(OutBillCycleExceptions billCycleExceptions) {
        this.billCycleExceptions = billCycleExceptions;
    }
}
