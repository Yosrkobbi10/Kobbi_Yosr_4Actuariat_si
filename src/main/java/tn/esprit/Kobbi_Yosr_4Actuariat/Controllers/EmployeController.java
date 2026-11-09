package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Employe;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    private final IEmployeService employeService;

    public EmployeController(IEmployeService employeService) {
        this.employeService = employeService;
    }

    @PostMapping("/ajouterEmploye")
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @PutMapping("/update")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.modifyEmploye(employe);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.removeEmploye(id);
    }

    @GetMapping("/getById/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.retrieveEmploye(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.retrieveAllEmploye();
    }
}
