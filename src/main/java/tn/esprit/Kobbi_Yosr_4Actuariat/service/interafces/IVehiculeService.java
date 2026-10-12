package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    public List<Vehicule> retrieveAllVehicule();

    public Vehicule retrieveVehicule(Long vehiculeId);

    public Vehicule addVehicule(Vehicule v);

    public void removeVehicule(Long vehiculeId);

    public Vehicule modifyVehicule(Vehicule vehicule);
}
