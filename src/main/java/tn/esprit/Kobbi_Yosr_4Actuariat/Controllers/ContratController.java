package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Contrat;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IContratService;

import java.util.List;

@RestController
@RequestMapping("/contrats")
public class ContratController {

    private final IContratService contratService;

    public ContratController(IContratService contratService) {
        this.contratService = contratService;
    }

    @PostMapping("/ajouterContrat")
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @PutMapping("/update")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.modifyContrat(contrat);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.removeContrat(id);
    }

    @GetMapping("/getById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.retrieveContrat(id);
    }

    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratService.retrieveAllContrat();
    }
}
