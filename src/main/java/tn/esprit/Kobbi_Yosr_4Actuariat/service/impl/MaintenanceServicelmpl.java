package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Maintenance;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.MaintenanceRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IMaintenanceService;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServicelmpl implements IMaintenanceService {

    MaintenanceRepository maintenanceRepository;

    public List<Maintenance> retrieveAllMaintenance() {
        return maintenanceRepository.findAll();
    }

    public Maintenance retrieveMaintenance(Long maintenanceId) {
        return maintenanceRepository.findById(maintenanceId).get();
    }

    public Maintenance addMaintenance(Maintenance m) {
        return maintenanceRepository.save(m);
    }

    public void removeMaintenance(Long maintenanceId) {
        maintenanceRepository.deleteById(maintenanceId);
    }

    public Maintenance modifyMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }
}
