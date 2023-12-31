package com.example.foyer.controller;

import com.example.foyer.entity.Chambre;
import com.example.foyer.entity.Enum.TypeChambre;
import com.example.foyer.service.IChambreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chambre")
@RequiredArgsConstructor
public class ChambreController {
    private final IChambreService iChambreService;
    @GetMapping
    public List<Chambre> retrieveAllChambres() {
        return  iChambreService.retrieveAllChambres() ;
    }

    @PostMapping
    public Chambre addChambre(@RequestBody Chambre c) {
        return iChambreService.addChambre(c);
    }

    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre c) {
        return iChambreService.updateChambre(c);
    }

    @GetMapping("{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return iChambreService.retrieveChambre(idChambre);
    }
    @GetMapping("getparNomUniv/{nomUniversite}")
    public List<Chambre> getChambresParNomUniversite( @PathVariable String nomUniversite){
        return iChambreService.getChambresParNomUniversite(nomUniversite);
    }
    @GetMapping("getparBlocEtType/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtTypeKeyWords (@PathVariable long idBloc,@PathVariable TypeChambre typeC) {
        return iChambreService.getChambresParBlocEtTypeKeyWords(idBloc,typeC);
    }
    @GetMapping("getparBlocEtTypeJPQL/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtTypeJPQL (@PathVariable long idBloc,@PathVariable TypeChambre typeC) {
        return iChambreService.getChambresParBlocEtTypeJPQL(idBloc,typeC);
    }
}
