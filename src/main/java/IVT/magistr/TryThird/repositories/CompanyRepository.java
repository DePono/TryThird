package IVT.magistr.TryThird.repositories;

import IVT.magistr.TryThird.models.Account;
import IVT.magistr.TryThird.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {
    List<Company> findByTitle(String title);
    List<Company> findCompanyByAccountsByTypeAccount(Account account);

}
