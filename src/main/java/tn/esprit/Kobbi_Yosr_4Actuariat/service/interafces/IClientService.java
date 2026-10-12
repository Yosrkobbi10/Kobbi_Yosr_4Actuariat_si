package tn.esprit.Kobbi_Yosr_4Actuariat.service.interafces;


import tn.esprit.Kobbi_Yosr_4Actuariat.entities.Client;

import java.util.List;

public interface IClientService {
    public List<Client> retrieveAllClient();
    public Client retrieveClient(Long clientId);
    public Client addClient(Client c);
    public void removeClient(Long clientId);
    public Client modifyClient(Client client);

}
