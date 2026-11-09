package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Maintenance;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    public MaintenanceController(IMaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @PostMapping("/ajouterMaintenance")
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @PutMapping("/update")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.modifyMaintenance(maintenance);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.removeMaintenance(id);
    }

    @GetMapping("/getById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return maintenanceService.retrieveMaintenance(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.retrieveAllMaintenance();
    }
}
