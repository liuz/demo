package com.example.demo.domain.outbound;

import com.example.demo.domain.PayloadBean;

import java.util.List;

public class OutResults {
    public List<PayloadBean> rows;

    public OutResults(List<PayloadBean> rows) {
        this.rows = rows;
    }

    public List<PayloadBean> getRows() {
        return rows;
    }

    public void setRows(List<PayloadBean> rows) {
        this.rows = rows;
    }
}
