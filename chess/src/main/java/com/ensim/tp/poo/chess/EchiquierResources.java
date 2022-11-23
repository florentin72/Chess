package com.ensim.tp.poo.chess;

import com.ensim.tp.poo.chess.model.Case;
import com.ensim.tp.poo.chess.model.Echiquier;
import com.ensim.tp.poo.chess.model.Reine;
import com.ensim.tp.poo.chess.model.Roi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/echiquier")
public class EchiquierResources {


    @Autowired
    private EchiquierServices echiquierServices;

    @GetMapping(path = "/", produces = "application/json")
    public Echiquier getPieces() {
      return echiquierServices.getEchiquier();
    }

    @PostMapping(path = "/roi", consumes = "application/json", produces = "application/json")
    public Pieces setRoi(Case cas)  throws InstantiationException, IllegalAccessException {
        return echiquierServices.setPieces(cas, Roi.class);
    }

    @PostMapping(path = "/reine", consumes = "application/json", produces = "application/json")
    public Pieces setReine(Case cas) throws InstantiationException, IllegalAccessException {
        return echiquierServices.setPieces(cas, Reine.class);
    }
}