
package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Agence;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.AgenceRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IAgenceService;

import java.util.List;


@Service
@AllArgsConstructor
public class AgenceServicelmpl implements IAgenceService {

    AgenceRepository agenceRepository;

    public List<Agence> retrieveAllAgence() {
        return agenceRepository.findAll();
    }

    public Agence retrieveAgence(Long agenceId) {
        return agenceRepository.findById(agenceId).get();
    }

    public Agence addAgence(Agence a) {
        return agenceRepository.save(a);
    }

    public void removeAgence(Long agenceId) {
        agenceRepository.deleteById(agenceId);
    }

    public Agence modifyAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
}
