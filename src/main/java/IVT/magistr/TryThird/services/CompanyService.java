package IVT.magistr.TryThird.services;

import IVT.magistr.TryThird.models.Client;
import IVT.magistr.TryThird.models.Company;
import IVT.magistr.TryThird.repositories.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public void save(Company company) {
        log.info("Saving new {}", company);
        companyRepository.save(company);
    }

    public void delete(String id) {
        companyRepository.deleteById(id);
    }

    public Company getCompanyById(String id) {
        return companyRepository.findById(id).orElse(null);
    }
    public void update(String id, Company updatedCompany) {
        updatedCompany.setPhone(id);
        companyRepository.save(updatedCompany);
    }


    public List<Client> getClientByCompanyId(String phone) {
        Optional<Company> company = companyRepository.findById(phone);
        return company.map(value -> (List<Client>) value.getClients()).orElse(null);
    }
}

