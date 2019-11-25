package com.example.demo.domain.outbound;

public class Outpayload {
    public OutBillCycleExceptions BillCycleExceptions;

    public Outpayload() {}

    public Outpayload(OutBillCycleExceptions billCycleExceptions) {
        BillCycleExceptions = billCycleExceptions;
    }

    public OutBillCycleExceptions getBillCycleExceptions() {
        return BillCycleExceptions;
    }

    public void setBillCycleExceptions(OutBillCycleExceptions billCycleExceptions) {
        BillCycleExceptions = billCycleExceptions;
    }
}
