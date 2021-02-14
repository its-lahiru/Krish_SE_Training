package com.lahiru.training.lendingservice.model;

import com.lahiru.training.librarycloud.commons.model.lend.Lend;

public class SimpleResponse implements Response {

    Lend lend;

    public SimpleResponse(Lend lend) {
        this.lend = lend;
    }

    public Lend getLend() {
        return lend;
    }

    public void setLend(Lend lend) {
        this.lend = lend;
    }
}
