package tn.esprit.Kobbi_Yosr_4Actuariat.Controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Client;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final IClientService clientService;

    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/ajouterClient")
    public Client createClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @PutMapping("/update")
    public Client updateClient(@RequestBody Client client) {
        return clientService.modifyClient(client);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.removeClient(id);
    }

    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.retrieveClient(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.retrieveAllClient();
    }
}
