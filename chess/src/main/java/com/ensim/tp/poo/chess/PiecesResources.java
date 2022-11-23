package com.ensim.tp.poo.chess;

import com.ensim.tp.poo.chess.model.Roi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/pieces")
public class PiecesResources {


    @Autowired
    private PiecesServices piecesServices;

    @GetMapping(path= "/", produces = "application/json")
    public Pieces getPieces(){
        Roi roi = new Roi();
        roi.setName("JE SUIS LE ROI");
        return roi;
    }


}
