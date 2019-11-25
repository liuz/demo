package com.example.demo.rest;
import static org.junit.Assert.assertEquals;
import com.example.demo.domain.PayloadBean;
import com.example.demo.domain.inbound.InResults;
import com.example.demo.domain.inbound.Inpayload;
import com.example.demo.domain.outbound.OutResults;
import com.example.demo.domain.outbound.Outpayload;
import com.example.demo.service.BillingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(value = BillingCycleController.class)
public class BillingCycleControllerTest<Inbound> {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BillingService billingService;
    List<PayloadBean> rows = new ArrayList<>();
    OutResults outResults = new OutResults(rows);
    Outpayload outpayload = new Outpayload(outResults);

    @Test
    public void test_processPayload() throws Exception {
        InResults inResults = new InResults();
        Inpayload inpayload = new Inpayload(inResults);
        Mockito.when(billingService.processPayload(inpayload)).thenReturn(outpayload);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/billingcycle/payload")
                .accept(MediaType.APPLICATION_JSON)
                .content(asJsonString(inpayload)).contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
    }

    public static String asJsonString(Object object) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
