package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Employe;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.EmployeRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IEmployeService;


import org.springframework.transaction.annotation.Transactional;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Agence;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.AgenceRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServicelmpl implements IEmployeService {

    EmployeRepository employeRepository;
    AgenceRepository agenceRepository;

    public List<Employe> retrieveAllEmploye() {
        return employeRepository.findAll();
    }

    public Employe retrieveEmploye(Long employeId) {
        return employeRepository.findById(employeId).get();
    }

    public Employe addEmploye(Employe e) {
        return employeRepository.save(e);
    }

    public void removeEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }


    @Override
    @Transactional
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye).get();
        employe.setAgence(null);
        return employeRepository.save(employe);
    }

    @Override
    @Transactional
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye).get();
        Agence agence = agenceRepository.findById(idAgence).get();

        if (employe.getAgence() != null) {
            throw new IllegalStateException("Il faut d'abord desaffecter l'employe");
        }

        employe.setAgence(agence);
        return employeRepository.save(employe);
    }
}
