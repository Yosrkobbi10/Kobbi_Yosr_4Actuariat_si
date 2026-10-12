package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Paiement;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.PaiementRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IPaiementService;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServicelmpl implements IPaiementService {
    PaiementRepository paiementRepository;

    public List<Paiement> retrieveAllPaiement() {
        return paiementRepository.findAll();
    }

    public Paiement retrievePaiement(Long paiementId) {
        return paiementRepository.findById(paiementId).get();
    }

    public Paiement addPaiement(Paiement p) {
        return paiementRepository.save(p);
    }

    public void removePaiement(Long paiementId) {
        paiementRepository.deleteById(paiementId);
    }

    public Paiement modifyPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }
}
