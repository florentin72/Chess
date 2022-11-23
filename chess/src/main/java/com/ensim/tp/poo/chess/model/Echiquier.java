package com.ensim.tp.poo.chess.model;

import com.ensim.tp.poo.chess.Pieces;

import java.util.ArrayList;
import java.util.List;

public class Echiquier   {
    private static Echiquier echiquier ;
    private List<Case> listCase;
    private List<Pieces> listPieces;
    private Echiquier()
    {
        listCase = new ArrayList<>();
        listPieces = new ArrayList<>();
    }

    public static Echiquier getEchiquier(){
        if(echiquier== null) {
            echiquier = new Echiquier();
            }
            return echiquier;
        }

    public List<Case> getListCase() {
        return listCase;
    }

    public void setListCase(List<Case> listCase) {
        this.listCase = listCase;
    }

    public List<Pieces> getListPieces() {
        return listPieces;
    }

    public void setListPieces(List<Pieces> listPieces) {
        this.listPieces = listPieces;
    }
}
