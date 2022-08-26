package com.classwork.timbachuk;

public class Hambuger{
    private int burger;
    private final int breadRoll = 250;
    private final int meat = 250;
    private int lettuce ;
    private int tomato;
    private int carrot;

    public Hambuger(int burger, int lettuce, int tomato, int carrot) {
        this.burger = burger;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public int getBreadRoll() {
        return breadRoll;
    }

    public int getBurger() {
        return burger;
    }

    public int calculateBurger(int burger) {
            return (getBreadRoll() + getMeat())*burger;
        }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce(int costLettuce, int quantity) {
        this.lettuce = lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int costTomato, int quantity) {
        this.tomato = quantity * costTomato;
    }

    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int costCarrot, int quantity) {
        this.carrot = costCarrot * quantity;
    }
}
