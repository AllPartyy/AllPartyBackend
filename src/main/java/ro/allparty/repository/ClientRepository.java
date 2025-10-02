package ro.allparty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.allparty.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}