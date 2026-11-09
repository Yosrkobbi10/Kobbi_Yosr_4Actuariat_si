package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Equipement;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("/equipements")
public class EquipementController {

    private final IEquipementService equipementService;

    public EquipementController(IEquipementService equipementService) {
        this.equipementService = equipementService;
    }

    @PostMapping("/ajouterEquipement")
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @PutMapping("/update")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifyEquipement(equipement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.removeEquipement(id);
    }

    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.retrieveEquipement(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipements() {
        return equipementService.retrieveAllEquipement();
    }
}
