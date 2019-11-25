package com.example.demo.domain.inbound;

import java.util.List;

public class InResults {

    public List<String> headers;
    public List<List<String>> rows;

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
        this.rows = rows;
    }
}
