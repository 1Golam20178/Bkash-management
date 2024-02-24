package com.bikash.bikash;

public class OptionDetails {
    int amount;
    int sendMoneyAmount;
    int cashInAmount ;
    int cashOutAmount ;


    public void OptionDetails()
    {

    } public void OptionDetails(int amount,int  sendMoneyAmount,int cashInAmount,int cashOutAmount)
    {
        this.amount=amount;
        this.cashOutAmount=cashOutAmount;
        this.sendMoneyAmount=sendMoneyAmount;
        this.cashInAmount=cashInAmount;

    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount1) {
        this.amount = amount1;
    }

    public int getSendMoneyAmount() {
        return sendMoneyAmount;
    }

    public void setSendMoneyAmount(int ss) {
        this.sendMoneyAmount = ss;
    }

    public int getCashInAmount() {
        return cashInAmount;
    }

    public void setCashInAmount(int ss3 ){
        this.cashInAmount = ss3;
    }

    public int getCashOutAmount() {
        return cashOutAmount;
    }

    public void setCashOutAmount(int ss2) {
        this.cashOutAmount = ss2;
    }



}
