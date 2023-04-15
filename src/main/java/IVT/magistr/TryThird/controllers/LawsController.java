package IVT.magistr.TryThird.controllers;

import IVT.magistr.TryThird.models.Law;
import IVT.magistr.TryThird.services.LawService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LawsController {

    private final LawService lawService;

    @GetMapping("/laws")
    public String laws( Model model) {
        model.addAttribute("laws", lawService.findAll());
        return "laws/laws";
    }

    @GetMapping("/law/{id}")
    public String info(@PathVariable Integer id, Model model) {
        model.addAttribute("laws",lawService.getLawById(id));
        return "laws/law-info";
    }

    @PostMapping("/law/create")
    public String save(Law law){
        lawService.save(law);
        return "redirect:/laws";
    }

    @PostMapping("/law/delete/{id}")
    public String delete(@PathVariable Integer id) {
        lawService.delete(id);
        return "redirect:/laws";
    }
}

