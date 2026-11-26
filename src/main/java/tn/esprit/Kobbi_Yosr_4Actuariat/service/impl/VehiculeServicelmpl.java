package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Vehicule;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.VehiculeRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IVehiculeService;

import org.springframework.transaction.annotation.Transactional;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Agence;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Equipement;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.AgenceRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.EquipementRepository;
import java.util.HashSet;

import java.util.List;


@Service
@AllArgsConstructor
public class VehiculeServicelmpl implements IVehiculeService {
    VehiculeRepository vehiculeRepository;
    AgenceRepository agenceRepository;
    EquipementRepository equipementRepository;

    public List<Vehicule> retrieveAllVehicule() {
        return vehiculeRepository.findAll();
    }

    public Vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculeRepository.findById(vehiculeId).get();
    }

    public Vehicule addVehicule(Vehicule v) {
        return vehiculeRepository.save(v);
    }

    public void removeVehicule(Long vehiculeId) {
        vehiculeRepository.deleteById(vehiculeId);
    }

    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Agence agence = agenceRepository.findById(idAgence).get();

        vehicule.setAgence(agence);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();

        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new HashSet<>());
        }

        vehicule.getEquipements().add(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();

        if (vehicule.getEquipements() != null) {
            vehicule.getEquipements().remove(equipement);
        }
        return vehiculeRepository.save(vehicule);
    }
}
