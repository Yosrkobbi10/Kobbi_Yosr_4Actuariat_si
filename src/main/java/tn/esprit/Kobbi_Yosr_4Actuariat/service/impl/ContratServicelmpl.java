package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Contrat;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.ContratRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IContratService;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServicelmpl implements IContratService {

    ContratRepository contratRepository;

    public List<Contrat> retrieveAllContrat() {
        return contratRepository.findAll();
    }

    public Contrat retrieveContrat(Long contratId) {
        return contratRepository.findById(contratId).get();
    }

    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }

    public void removeContrat(Long contratId) {
        contratRepository.deleteById(contratId);
    }

    public Contrat modifyContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }
}
