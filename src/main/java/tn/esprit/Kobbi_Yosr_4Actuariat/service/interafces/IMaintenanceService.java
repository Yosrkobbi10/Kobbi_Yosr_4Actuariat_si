package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public List<Maintenance> retrieveAllMaintenance();

    public Maintenance retrieveMaintenance(Long maintenanceId);

    public Maintenance addMaintenance(Maintenance m);

    public void removeMaintenance(Long maintenanceId);

    public Maintenance modifyMaintenance(Maintenance maintenance);
}
