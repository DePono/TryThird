package IVT.magistr.TryThird.repositories;

import IVT.magistr.TryThird.models.Client;
import IVT.magistr.TryThird.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    List<Client> findByEmail(String email);
    List<Client> findByOwner(Company owner);
    List<Client> findClientByName(String clientName);
    List<Client> findClientByNameStartingWith(String startingWith);
    List<Client> findClientByNameOrEmail(String name, String email);
}
