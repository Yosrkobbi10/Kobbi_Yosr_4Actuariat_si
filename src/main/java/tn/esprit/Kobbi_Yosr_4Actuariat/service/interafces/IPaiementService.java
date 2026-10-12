package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    public List<Paiement> retrieveAllPaiement();

    public Paiement retrievePaiement(Long paiementId);

    public Paiement addPaiement(Paiement p);

    public void removePaiement(Long paiementId);

    public Paiement modifyPaiement(Paiement paiement);
}
