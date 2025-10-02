package ro.allparty.service;


import org.springframework.stereotype.Service;
import ro.allparty.entity.Client;
import ro.allparty.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepo;

    public ClientService(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }
}
