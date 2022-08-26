package com.chibuzor.array;

public class Native {
    private int scvaId;
    private String firstName;
    private String lastName;
    private int cohordId;

    public String getScvaId() {
        if (cohordId == 12) {
            return "SCV-UNICORNS" + scvaId;
        }
        return "SCV" + cohordId + scvaId;
    }

    public void setScvaId(int scvaId) {

        this.scvaId = scvaId;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCohordId() {
        return cohordId;
    }

    public void setCohordId(int cohordId) {
        if (cohordId != 12) {
            //do nothing
        } else {
            this.cohordId = cohordId;
        }
    }
}