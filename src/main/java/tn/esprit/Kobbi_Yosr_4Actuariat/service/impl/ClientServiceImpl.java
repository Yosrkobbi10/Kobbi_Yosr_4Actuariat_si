package tn.esprit.Kobbi_Yosr_4Actuariat.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Client;
import tn.esprit.Kobbi_Yosr_4Actuariat.repository.ClientRepository;
import tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces.IClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements IClientService {

    ClientRepository clientRepository;

    public List<Client> retrieveAllClient() {
        return clientRepository.findAll();
    }

    public Client retrieveClient(Long clientId) {
        return clientRepository.findById(clientId).get();
    }

    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    public void removeClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    public Client modifyClient(Client client) {
        return clientRepository.save(client);
    }
}
