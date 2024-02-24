package com.bikash.bikash;

public class History {

    int sendmoney;
    int cashout;
    int cashin;
    public History()
    {

    }

    public History(int sendmoney, int cashout, int cashin) {
        this.sendmoney = sendmoney;
        this.cashout = cashout;
        this.cashin = cashin;
    }

    public int getSendmoney() {
        return sendmoney;
    }

    public void setSendmoney(int sendmoney) {
        this.sendmoney = sendmoney;
    }

    public int getCashout() {
        return cashout;
    }

    public void setCashout(int cashout) {
        this.cashout = cashout;
    }

    public int getCashin() {
        return cashin;
    }

    public void setCashin(int cashin) {
        this.cashin = cashin;
    }
}
