package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Paiement;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IPaiementService;

import java.util.List;

@RestController
@RequestMapping("/paiements")
public class PaiementController {

    private final IPaiementService paiementService;

    public PaiementController(IPaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @PostMapping("/ajouterPaiement")
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return paiementService.addPaiement(paiement);
    }

    @PutMapping("/update")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return paiementService.modifyPaiement(paiement);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaiement(@PathVariable Long id) {
        paiementService.removePaiement(id);
    }

    @GetMapping("/getById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.retrievePaiement(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiements() {
        return paiementService.retrieveAllPaiement();
    }
}
