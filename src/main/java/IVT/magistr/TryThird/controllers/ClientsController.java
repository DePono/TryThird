package IVT.magistr.TryThird.controllers;


import IVT.magistr.TryThird.models.Client;
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
public class ClientsController {
    private final ClientService clientService;
    private final CompanyService companyService;

    @GetMapping("/clients")
    public String clients(String username, Model model) {
        model.addAttribute("clients", clientService.findAll(username));
        return "clients";
    }

    @GetMapping("/client/{phone}")
    public String info(@PathVariable String phone, Model model) {
        Client client = clientService.getClientById(phone);
        model.addAttribute("client", client);
        return "client-info";
    }

    @PostMapping("/client/create")
    public String save(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }

    @PostMapping("/client/delete/{id}")
    public String delete(@PathVariable String id) {
        clientService.delete(id);
        return "redirect:/clients";
    }
}
