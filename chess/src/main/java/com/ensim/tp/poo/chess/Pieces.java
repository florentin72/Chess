package com.ensim.tp.poo.chess;

public abstract class Pieces {

    private String name;

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
