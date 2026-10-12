package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Agence;

import java.util.List;


public interface IAgenceService {

    public List<Agence> retrieveAllAgence();
    public Agence retrieveAgence(Long agenceId);
    public Agence addAgence(Agence a);
    public void removeAgence(Long agenceId);
    public Agence modifyAgence(Agence agence);
}
