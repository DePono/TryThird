package IVT.magistr.TryThird.controllers;


import IVT.magistr.TryThird.models.Company;
import IVT.magistr.TryThird.services.AccountService;
import IVT.magistr.TryThird.services.ClientService;
import IVT.magistr.TryThird.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class CompaniesController {
    private final CompanyService companyService;
    private final ClientService clientService;
    private final AccountService accountService;

    @GetMapping("/company")
    public String companies(Model model) {
        model.addAttribute("companies", companyService.findAll());
        return "companies";
    }

    @GetMapping("/company/{id}")
    public String info(@PathVariable String id, Model model) {
        Company company = companyService.getCompanyById(id);
        model.addAttribute("company", company);
        model.addAttribute("clients",companyService.getClientByCompanyId(id));
        return "company-info";
    }

    @PostMapping("/company/create")
    public String create(Company company) {
        companyService.save(company);
        return "redirect:/company";
    }

    @PostMapping("/company/delete/{id}")
    public String delete(@PathVariable String id) {
        companyService.delete(id);
        return "redirect:/company";
    }
    @PostMapping("/company/{id}")
    public String update(@PathVariable String id, Company company){
        companyService.update(id,company);
        return "company-info";
    }
    @PostMapping("/company/{id}/edit")
    public String edit(Model model, @PathVariable String id){
        model.addAttribute("company",companyService.getCompanyById(id));
        return "company-edit";
    }
}
//добавить через сервлеты на отлично, пара запросов по паре табличек