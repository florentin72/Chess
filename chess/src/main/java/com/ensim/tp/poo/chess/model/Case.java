package com.ensim.tp.poo.chess.model;

import com.ensim.tp.poo.chess.Pieces;

public class Case {

    private int postionX;
    private int postionY;
    private Pieces pieces;
    public int getPostionX() {
        return postionX;
    }

    public void setPostionX(int postionX) {
        this.postionX = postionX;
    }

    public int getPostionY() {
        return postionY;
    }

    public void setPostionY(int postionY) {
        this.postionY = postionY;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }
}
