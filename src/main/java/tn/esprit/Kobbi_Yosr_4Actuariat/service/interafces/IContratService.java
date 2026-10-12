package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Contrat;

import java.util.List;

public interface IContratService {

    public List<Contrat> retrieveAllContrat();
    public Contrat retrieveContrat(Long contratId);
    public Contrat addContrat(Contrat a);
    public void removeContrat(Long contratId);
    public Contrat modifyContrat(Contrat contrat);
}
