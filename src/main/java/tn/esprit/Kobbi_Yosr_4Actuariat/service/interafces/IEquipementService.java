package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    public List<Equipement> retrieveAllEquipement();

    public Equipement retrieveEquipement(Long equipementId);

    public Equipement addEquipement(Equipement e);

    public void removeEquipement(Long equipementId);

    public Equipement modifyEquipement(Equipement equipement);
}

