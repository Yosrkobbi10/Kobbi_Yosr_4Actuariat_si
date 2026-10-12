package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;

import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Employe;

import java.util.List;

public interface IEmployeService {

    public List<Employe> retrieveAllEmploye();

    public Employe retrieveEmploye(Long employeId);

    public Employe addEmploye(Employe e);

    public void removeEmploye(Long employeId);

    public Employe modifyEmploye(Employe employe);
}


