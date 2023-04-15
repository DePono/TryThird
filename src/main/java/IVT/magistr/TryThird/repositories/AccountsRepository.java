package IVT.magistr.TryThird.repositories;


import IVT.magistr.TryThird.models.Account;
import IVT.magistr.TryThird.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountsRepository extends JpaRepository<Account, String> {
    List<Account> findByTitle(String title);
    List<Account> findAccountByCompaniesByTitle(Company title);
}
