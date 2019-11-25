package com.example.demo.service.impl;

import com.example.demo.domain.PayloadBean;
import com.example.demo.domain.inbound.Inpayload;
import com.example.demo.domain.inbound.InResults;
import com.example.demo.domain.outbound.OutResults;
import com.example.demo.domain.outbound.Outpayload;
import com.example.demo.service.BillingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {

    @Override
    public Outpayload processPayload(Inpayload inpayload) {
        InResults inResults = inpayload.getInResults();
        List<String> headers = inResults.getHeaders();
        List<List<String>> rows = inResults.getRows();
        Outpayload outpayload = new Outpayload();
        outpayload.setResult(handleFormat(headers, rows));
        return outpayload;
    }

    private OutResults handleFormat(List<String> headers, List<List<String>> rows) {
        List<PayloadBean> beanList = new ArrayList<>();
        for(int i=0; i<rows.size(); i++) {
            PayloadBean bean = new PayloadBean();
            for(int j=0; j<headers.size(); j++) {
                if("MAC_ID".equalsIgnoreCase(headers.get(j))) {
                    bean.setMac_ID(rows.get(i).get(j));
                } else if("UTIL_DEVICE_ID".equalsIgnoreCase(headers.get(j))) {
                    bean.setUtil_device_ID(rows.get(i).get(j));
                } else if("BILLING_CYCLE_NUM".equalsIgnoreCase(headers.get(j))) {
                    bean.setBilling_cycle_num(rows.get(i).get(j));
                }
            }
            beanList.add(bean);
        }
        return new OutResults(beanList);
    }
}
