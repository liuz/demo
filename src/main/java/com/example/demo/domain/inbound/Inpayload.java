package com.example.demo.domain.inbound;

public class Inpayload {

    public InBillCycleExceptions BillCycleExceptions;

    public Inpayload () {}

    public Inpayload(InBillCycleExceptions billCycleExceptions) {
        BillCycleExceptions = billCycleExceptions;
    }

    public InBillCycleExceptions getBillCycleExceptions() {
        return BillCycleExceptions;
    }

    public void setBillCycleExceptions(InBillCycleExceptions billCycleExceptions) {
        BillCycleExceptions = billCycleExceptions;
    }
}
