package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Equipement;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.EquipementRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IEquipementService;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementServicelmpl implements IEquipementService {

    EquipementRepository equipementRepository;

    public List<Equipement> retrieveAllEquipement() {
        return equipementRepository.findAll();
    }

    public Equipement retrieveEquipement(Long equipementId) {
        return equipementRepository.findById(equipementId).get();
    }

    public Equipement addEquipement(Equipement e) {
        return equipementRepository.save(e);
    }

    public void removeEquipement(Long equipementId) {
        equipementRepository.deleteById(equipementId);
    }

    public Equipement modifyEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
}
