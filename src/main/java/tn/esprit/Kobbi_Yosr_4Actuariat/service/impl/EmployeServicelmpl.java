package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Employe;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.EmployeRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServicelmpl implements IEmployeService {

    EmployeRepository employeRepository;

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
}
