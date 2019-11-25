package com.example.demo.domain;

public class PayloadBean {

    public String mac_ID;
    public String util_device_ID;
    public String billing_cycle_num;

    public PayloadBean() {}

    public PayloadBean(String mac_ID, String util_device_ID, String billing_cycle_num) {
        this.mac_ID = mac_ID;
        this.util_device_ID = util_device_ID;
        this.billing_cycle_num = billing_cycle_num;
    }

    public String getMac_ID() {
        return mac_ID;
    }

    public void setMac_ID(String mac_ID) {
        this.mac_ID = mac_ID;
    }

    public String getUtil_device_ID() {
        return util_device_ID;
    }

    public void setUtil_device_ID(String util_device_ID) {
        this.util_device_ID = util_device_ID;
    }

    public String getBilling_cycle_num() {
        return billing_cycle_num;
    }

    public void setBilling_cycle_num(String billing_cycle_num) {
        this.billing_cycle_num = billing_cycle_num;
    }
}
