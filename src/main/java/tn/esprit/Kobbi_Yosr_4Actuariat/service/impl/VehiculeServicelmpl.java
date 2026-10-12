package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Vehicule;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.VehiculeRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IVehiculeService;

import java.util.List;


@Service
@AllArgsConstructor
public class VehiculeServicelmpl implements IVehiculeService {
    VehiculeRepository vehiculeRepository;

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
}
