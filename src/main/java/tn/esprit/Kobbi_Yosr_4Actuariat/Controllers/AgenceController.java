package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Agence;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/agences")
public class AgenceController {

    private final IAgenceService agenceService;

    public AgenceController(IAgenceService agenceService) {
        this.agenceService = agenceService;
    }

    @PostMapping("/ajouterAgence")
    public Agence createAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PutMapping("/update")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.modifyAgence(agence);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }

    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.retrieveAgence(id);
    }

    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.retrieveAllAgence();
    }
}
