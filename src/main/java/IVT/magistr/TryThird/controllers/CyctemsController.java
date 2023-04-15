package IVT.magistr.TryThird.controllers;


import IVT.magistr.TryThird.models.Cyctem;
import IVT.magistr.TryThird.services.CyctemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class CyctemsController {
    private final CyctemService cyctemService;

   @GetMapping("/cyctems")
    public String cyctems(String title, Model model) {
        model.addAttribute("cyctems", cyctemService.findAll(title));
        return "cyctems";
    }

    @GetMapping("/cyctem/{id}")
    public String info(@PathVariable Integer id, Model model) {
        Cyctem cyctem = cyctemService.getCyctemById(id);
        model.addAttribute("cyctem", cyctem);
        return "cyctem-info";
    }

    @PostMapping("/cyctem/create")
    public String save(Cyctem cyctem) throws IOException {
        cyctemService.save(cyctem);
        return "redirect:/cyctems";
    }

    @PostMapping("/cyctem/delete/{id}")
    public String delete(@PathVariable Integer id) {
        cyctemService.delete(id);
        return "redirect:/cyctems";
    }
}

