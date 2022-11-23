package com.ensim.tp.poo.chess;

import com.ensim.tp.poo.chess.model.Case;
import com.ensim.tp.poo.chess.model.Echiquier;
import org.springframework.stereotype.Component;

@Component
public class EchiquierServices  {


    /**
     *  Méthode qui place une piece sur l'echiquier
     * @param x postion x
     * @param y position y
     * @param pieceClazz le type de piece
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T  setPieces(Case cas, Class<T> pieceClazz) throws IllegalAccessException, InstantiationException {
        T pieces = pieceClazz.newInstance();
        cas.setPieces((Pieces) pieces);
        Echiquier.getEchiquier().getListCase().add(cas);
        return pieces;
    }

    /**
     * Méthode qui récupère l'etat de l'echiquier
     * @return l'echiquier
     */
    public Echiquier getEchiquier(){
        return Echiquier.getEchiquier();

    }
}
