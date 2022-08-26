package com.timbachuk;

public class VipCustomers {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomers(){
        this("name",50000,"g@yahoo.com");
    }

    public VipCustomers(String name, int creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomers(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
