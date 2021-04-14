package com.example.demo;

import java.time.LocalDate;

public class PreprcDo {
//todo 需要替换为短流水表的属性
    private String uuid;
    private Integer amt;
    private LocalDate tranDate;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public LocalDate getTranDate() {
        return tranDate;
    }

    public void setTranDate(LocalDate tranDate) {
        this.tranDate = tranDate;
    }
}
